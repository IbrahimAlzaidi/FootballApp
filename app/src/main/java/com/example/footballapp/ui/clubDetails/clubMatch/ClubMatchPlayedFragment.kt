package com.example.footballapp.ui.clubDetails.clubMatch

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubMatchPlayedBinding
import com.example.footballapp.ui.base.BaseFragment


class ClubMatchPlayedFragment(val args: Int?) :
    BaseFragment<FragmentClubMatchPlayedBinding, ClubMatchPlayedViewModel>(R.layout.fragment_club_match_played) {
    override fun setup() {
        binding.viewModel = viewModel
        val currentTeamMatchAdapter = ClubMatchAdapter(emptyList(),null)
        binding.currentMatch.adapter = currentTeamMatchAdapter
    }

    override fun getViewModel(): Class<ClubMatchPlayedViewModel> =
        ClubMatchPlayedViewModel::class.java

    override val arg: Int?
        get() = args
    override val leagueId: Int?
        get() = null
}
