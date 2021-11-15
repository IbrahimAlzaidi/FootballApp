package com.example.footballapp.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDirections
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.footballapp.BR
import com.example.footballapp.ui.clubDetails.squadInfo.SquadInfoFragment
import com.example.footballapp.util.*

abstract class BaseFragment<VDB : ViewDataBinding,VM : BaseViewModel>(
    @LayoutRes private val layoutResId: Int
) : Fragment() {
    abstract fun setup()
    abstract fun getViewModel(): Class<VM>
    abstract val arg: Int?
    abstract val leagueId: Int?
    abstract val teamId: Int?
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
        _viewModel = ViewModelProvider(
            this,
            ViewModelFactory(arg = arg, leagueId = leagueId, teamId = teamId)//New one
        ).get(getViewModel())
        _binding.apply {
            lifecycleOwner = this@BaseFragment.viewLifecycleOwner
            setVariable(BR.viewModel, _viewModel)
        }
        setup()
        observeNavigation()
        return _binding.root
    }

    private val _navigationLiveData = MutableLiveData<Event<NavigationController>>()
    private val navigationLiveData: LiveData<Event<NavigationController>> = _navigationLiveData

    fun navigate(direction: NavDirections) {
        _navigationLiveData.value = Event(NavigationController(direction))
    }

    private fun observeNavigation() {
        navigationLiveData.observe(viewLifecycleOwner, {
            it?.getContentIfNotHandle()?.let { command ->
                findNavController().navigate(
                    command.directions,
                    getExtra()
                )
            }
        })
    }

    private fun getExtra(): FragmentNavigator.Extras = FragmentNavigatorExtras()


}
