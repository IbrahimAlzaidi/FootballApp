package com.example.footballapp.ui.leagueDetails.standing

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.ArgumentInteraction

class StandingFragment(private val args: ArgumentInteraction): BaseFragment<FragmentStandingBinding, StandingViewModel>(R.layout.fragment_standing){
    override fun getViewModel()= StandingViewModel::class.java
    override fun setup() {
        binding.viewModel = viewModel
        val standingAdapter = StandingAdapter(emptyList(), null)
        binding.leagueRecycler.adapter = standingAdapter
    }
    override val arg: Int
        get() = args.getLeagueId()
}
