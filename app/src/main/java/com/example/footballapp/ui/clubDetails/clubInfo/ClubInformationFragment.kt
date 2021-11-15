package com.example.footballapp.ui.clubDetails.clubInfo

import android.os.Bundle
import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClupInformationBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.clubDetails.ClubDetailsViewModel
import com.example.footballapp.ui.clubDetails.squadInfo.SquadInfoFragment
import com.example.footballapp.util.Constant


class ClubInformationFragment :
    BaseFragment<FragmentClupInformationBinding, ClubInformationViewModel>(R.layout.fragment_clup_information) {
    override fun setup() {
    }

    override fun onStart() {
        super.onStart()
        binding.viewModel =
            ClubInformationViewModel(arguments?.getInt(Constant.TEAM_ID_KEY), arguments?.getInt(Constant.LEAGUE_ID_KEY))
    }

    override fun getViewModel() = ClubInformationViewModel::class.java



    companion object {
        fun newInstance(teamId: Int?, leagueId: Int?): ClubInformationFragment =
            ClubInformationFragment().apply {
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
