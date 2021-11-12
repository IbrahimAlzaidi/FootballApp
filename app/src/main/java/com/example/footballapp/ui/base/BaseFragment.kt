package com.example.footballapp.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.footballapp.BR
import com.example.footballapp.util.FootballViewPager
import com.example.footballapp.navigation.NavigationController
import com.example.footballapp.util.ViewModelFactory
import com.example.footballapp.util.ViewPagerTransitions
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

abstract class BaseFragment<VDB : ViewDataBinding, VM : BaseViewModel>(
    @LayoutRes private val layoutResId: Int
) : Fragment() {
    abstract fun setup()
    abstract fun getViewModel(): Class<VM>
    abstract val arg: Int?
    abstract val leagueId: Int?
    abstract val teamId : Int?
    private lateinit var _binding: VDB
    protected val binding: VDB
        get() = _binding

    private lateinit var _viewModel: VM
    protected val viewModel: VM
        get() = _viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, layoutResId, container, false)
        val factory = ViewModelFactory(arg, leagueId, teamId)
        _viewModel = ViewModelProvider(this, factory).get(getViewModel())
        _binding.apply {
            lifecycleOwner = viewLifecycleOwner
            setVariable(BR.viewModel, _viewModel)
        }
        setup()
        observeNavigation()
        return _binding.root
    }

    private fun observeNavigation() {
        _viewModel.navigationLiveData.observe(viewLifecycleOwner, {
            it?.getContentIfNotHandle()?.let { command ->
                when (command) {
                    is NavigationController.To -> findNavController().navigate(
                        command.directions,
                        getExtra()
                    )
                }
            }
        })
    }

    private fun getExtra(): FragmentNavigator.Extras = FragmentNavigatorExtras()

}
