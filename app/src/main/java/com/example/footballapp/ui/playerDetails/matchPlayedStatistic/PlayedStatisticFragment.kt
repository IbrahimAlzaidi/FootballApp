package com.example.footballapp.ui.playerDetails.matchPlayedStatistic

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayedStatisticBinding
import com.example.footballapp.ui.base.BaseFragment

class PlayedStatisticFragment(private val playerId: Int?) : BaseFragment<FragmentPlayedStatisticBinding, PlayedStatisticViewModel>(R.layout.fragment_played_statistic){
    override fun setup() {
        binding.viewModel = viewModel
    }
    override fun getViewModel(): Class<PlayedStatisticViewModel> = PlayedStatisticViewModel::class.java

    override val arg: Int?
        get() = playerId
    override val leagueId: Int?
        get() = null
}
