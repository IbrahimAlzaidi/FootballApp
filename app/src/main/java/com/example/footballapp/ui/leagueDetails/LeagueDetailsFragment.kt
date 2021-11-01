package com.example.footballapp.ui.leagueDetails

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.LeagueDetailsViewModel


class LeagueDetailsFragment : BaseFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>(R.layout.fragment_league_details) {
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel()= LeagueDetailsViewModel::class.java
}