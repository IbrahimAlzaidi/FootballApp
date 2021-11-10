package com.example.footballapp.ui.playerDetails.playedInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerInformationsBinding
import com.example.footballapp.ui.base.BaseFragment



class PlayerInformationFragment(private val playerId: Int) : BaseFragment<FragmentPlayerInformationsBinding,PlayerInformationViewModel>(
    R.layout.fragment_player_informations){
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel(): Class<PlayerInformationViewModel> = PlayerInformationViewModel::class.java

    override val arg: Int?
        get() = playerId
    override val leagueId: Int?
        get() = null
}
