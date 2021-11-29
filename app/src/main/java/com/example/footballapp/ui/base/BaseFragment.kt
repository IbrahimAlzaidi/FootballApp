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
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.footballapp.BR
import com.example.footballapp.model.domain.NavigationController
import com.example.footballapp.util.*

abstract class BaseFragment<VDB : ViewDataBinding, VM : BaseViewModel>(
    @LayoutRes private val layoutResId: Int,
) : Fragment() {

    abstract fun getViewModel(): Class<VM>

    private lateinit var _binding: VDB
    protected val binding: VDB
        get() = _binding

    private lateinit var _viewModel: VM
    protected val viewModel: VM
        get() = _viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, layoutResId, container, false)
        ViewModelFactory.listOfViewModels.add(getViewModel())
        _viewModel = ViewModelProvider(this, ViewModelFactory()).get(getViewModel())
        _binding.apply {
            lifecycleOwner = this@BaseFragment.viewLifecycleOwner
            setVariable(BR.viewModel, _viewModel)
        }
        viewModel.navigationLiveData.observeEvent(viewLifecycleOwner, findNavController())
        return _binding.root
    }
}
