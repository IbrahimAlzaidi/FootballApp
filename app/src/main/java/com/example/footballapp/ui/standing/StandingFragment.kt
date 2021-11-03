package com.example.footballapp.ui.standing

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.StandingViewModel

class StandingFragment: BaseFragment<FragmentStandingBinding, StandingViewModel>(R.layout.fragment_standing){
    override fun setup() {
        binding.viewModel = viewModel
        val standingAdapter = StandingAdapter(emptyList(), null)
        binding.leagueRecycler.adapter = standingAdapter
    }
    override fun getViewModel()= StandingViewModel::class.java
}
