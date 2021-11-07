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
import com.example.footballapp.util.ViewModelFactory

abstract class BaseFragment<VDB : ViewDataBinding, VM : BaseViewModel>(
    @LayoutRes private val layoutResId: Int) : Fragment() {
    abstract fun setup()
    abstract fun getViewModel(): Class<VM>
    abstract val arg: Int?
    abstract val leagueId: Int?
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
        val factory = ViewModelFactory(arg,leagueId)
        _viewModel = ViewModelProvider(this, factory).get(getViewModel())
        _binding.lifecycleOwner = viewLifecycleOwner
        setup()
        return _binding.root
    }
}
