package com.example.footballapp.ui.clubDetails.squadInfo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentInfoSquadBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.clubDetails.ClubDetailsFragment
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.ui.clubDetails.clubInfo.ClubInformationFragment
import com.example.footballapp.util.Constant
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.OnClickListener
import kotlin.math.log

class SquadInfoFragment() :
    BaseFragment<FragmentInfoSquadBinding, SquadInfoViewModel>(R.layout.fragment_info_squad),
    OnClickListener {

    override fun setup() {
        val teamPlayerAdapter = SquadInfoAdapter(emptyList(), this)
        binding.teamPlayers.adapter = teamPlayerAdapter
    }

    override fun onStart() {
        super.onStart()
        binding.viewModel = arguments?.getInt(Constant.TEAM_ID_KEY)?.let { SquadInfoViewModel(it) } }

    override fun getViewModel() = SquadInfoViewModel::class.java

    override fun onClickItem(id: Int, teamId: Int?, leagueId: Int?) {
        navigate(
            ClubDetailsFragmentDirections.actionClubDetailsFragmentToPlayerDetailsFragment(
                id,
                arguments?.getInt(Constant.TEAM_ID_KEY)!!,
                arguments?.getInt(Constant.LEAGUE_ID_KEY)!!
            )
        )
    }
    override val leagueId: Int?
        get() = null
    override val arg: Int?
        get() = null
    override val teamId: Int?
        get() = null

    companion object {
        fun newInstance(teamId: Int?, leagueId: Int?): SquadInfoFragment =
            SquadInfoFragment().apply {
                arguments = Bundle().apply {
                    if (teamId != null) {
                        putInt(Constant.TEAM_ID_KEY, teamId)
                    }
                    if (leagueId != null) {
                        putInt(Constant.LEAGUE_ID_KEY, leagueId)
                    }
                }
            }
    }
}
