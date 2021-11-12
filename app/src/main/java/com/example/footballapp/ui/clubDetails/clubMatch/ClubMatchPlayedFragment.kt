package com.example.footballapp.ui.clubDetails.clubMatch

import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubMatchPlayedBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant
import com.example.footballapp.util.Constant.TAG


class ClubMatchPlayedFragment(private val teamID: Int?) :
    BaseFragment<FragmentClubMatchPlayedBinding, ClubMatchPlayedViewModel>(R.layout.fragment_club_match_played) {
    override fun setup() {
        val currentTeamMatchAdapter = ClubMatchAdapter(emptyList(), viewModel)
        binding.currentMatch.adapter = currentTeamMatchAdapter
    }

    override fun getViewModel() = ClubMatchPlayedViewModel::class.java

    override val arg: Int?
        get() = teamID
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
