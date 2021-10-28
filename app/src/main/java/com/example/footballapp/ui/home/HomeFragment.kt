package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.HomeViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home){
    override fun setup() {
        binding.viewModel = viewModel as HomeViewModel?
        val adapter = TeamsAdapter(mutableListOf(),null)
        binding.recycleView.adapter = adapter
    }
}
