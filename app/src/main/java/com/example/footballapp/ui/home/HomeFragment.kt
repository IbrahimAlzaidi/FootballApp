package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.HomeViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home){
    private val viewModel = HomeViewModel()
    override fun setup() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        val adapter = TeamsAdapter(mutableListOf(),null)
        binding.recycleView.adapter = adapter
    }
}
