package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.HomeViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home){
    override fun setup() {
        binding.viewModel = viewModel
        val leaguesAdapter = LeaguesAdapter(mutableListOf(),null)
        val matchAdapter = MatchAdapter(mutableListOf(),null)
        binding.recycleView.adapter = leaguesAdapter
        binding.matchRecycler.adapter = matchAdapter
    }
    override fun getViewModel()= HomeViewModel::class.java
}
