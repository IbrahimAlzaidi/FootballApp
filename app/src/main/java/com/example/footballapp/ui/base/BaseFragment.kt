package com.example.footballapp.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<VDB : ViewDataBinding>(@LayoutRes private val layoutResId : Int) : Fragment() {
    abstract fun setup()
    private lateinit var _binding: VDB
    protected val binding: VDB
    get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setup()
       _binding = DataBindingUtil.inflate(inflater,layoutResId,container,false)
        return _binding.root
    }
}