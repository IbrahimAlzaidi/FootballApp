package com.example.footballapp.ui.clubDetails.squadInfo

import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentInfoSquadBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant
import com.example.footballapp.util.Constant.TAG

class SquadInfoFragment(private val teamID: Int?, private val leagueID: Int) :
    BaseFragment<FragmentInfoSquadBinding, SquadInfoViewModel>(R.layout.fragment_info_squad){

    override fun setup() {
        val teamPlayerAdapter = SquadInfoAdapter(emptyList(), viewModel)
        binding.teamPlayers.adapter = teamPlayerAdapter
        Log.i(TAG, "SquadInfoFragment: $leagueID - $teamID")
    }

    override fun getViewModel(): Class<SquadInfoViewModel> = SquadInfoViewModel::class.java
    override val leagueId: Int
        get() = leagueID
    override val arg: Int?
        get() = teamID
    override val teamId: Int?
        get() = null

}
