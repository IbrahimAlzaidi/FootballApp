package com.example.footballapp.ui.clubDetails.squadInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentInfoSquadBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel

class SquadInfoFragment(private val teamId: Int?) :
    BaseFragment<FragmentInfoSquadBinding, SquadInfoViewModel>(R.layout.fragment_info_squad){

    override fun setup() {
        binding.viewModel = viewModel
        val teamPlayerAdapter = SquadInfoAdapter(emptyList(), viewModel)
        binding.teamPlayers.adapter = teamPlayerAdapter
    }

    override fun getViewModel(): Class<SquadInfoViewModel> = SquadInfoViewModel::class.java
    override val leagueId: Int?
        get() = null
    override val arg: Int?
        get() = teamId

}
