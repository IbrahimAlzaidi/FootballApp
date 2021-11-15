package com.example.footballapp.ui.playerDetails.matchPlayedStatistic

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayedStatisticBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.util.Constant

class PlayedStatisticFragment :
    BaseFragment<FragmentPlayedStatisticBinding, PlayedStatisticViewModel>(R.layout.fragment_played_statistic) {

    override fun getViewModel() = PlayedStatisticViewModel::class.java

    override fun onStart() {
        super.onStart()
        binding.viewModel = PlayedStatisticViewModel(
            arguments?.getInt(Constant.PLAYER_ID_KEY),
            arguments?.getInt(Constant.LEAGUE_ID_KEY)
        )
    }
    companion object : InstantsFragments<PlayedStatisticFragment>(PlayedStatisticFragment::class.java)
}
