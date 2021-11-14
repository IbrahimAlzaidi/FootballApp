package com.example.footballapp.ui.clubDetails.clubMatch

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubMatchPlayedBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class ClubMatchPlayedFragment(private val teamID: Int?) :
    BaseFragment<FragmentClubMatchPlayedBinding, ClubMatchPlayedViewModel>
        (R.layout.fragment_club_match_played), OnClickListener {

    override fun setup() {
        val currentTeamMatchAdapter = ClubMatchAdapter(emptyList(), this)
        binding.currentMatch.adapter = currentTeamMatchAdapter
    }
    override fun onClickItem(id: Int, teamId: Int?, leagueId: Int?) {
        navigate(ClubDetailsFragmentDirections.actionClubDetailsFragmentToMatchDetailsFragment(id))
    }
    override fun getViewModel() = ClubMatchPlayedViewModel::class.java

    override val arg: Int?
        get() = teamID
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
