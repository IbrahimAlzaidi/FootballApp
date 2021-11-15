package com.example.footballapp.ui.playerDetails.matchPlayedStatistic

import android.os.Bundle
import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayedStatisticBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant

class PlayedStatisticFragment() :
    BaseFragment<FragmentPlayedStatisticBinding, PlayedStatisticViewModel>(R.layout.fragment_played_statistic) {
    override fun setup() {}

    override fun getViewModel(): Class<PlayedStatisticViewModel> =
        PlayedStatisticViewModel::class.java

    override val arg: Int?
        get() = null
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

    override fun onStart() {
        super.onStart()
        binding.viewModel = PlayedStatisticViewModel(
            arguments?.getInt(Constant.PLAYER_ID_KEY),
            arguments?.getInt(Constant.LEAGUE_ID_KEY)
        )
        Log.i(Constant.TAG, "PlayedStatisticFragment______________onStart:" +
                " ${arguments?.getInt(Constant.PLAYER_ID_KEY)}" +
                " ${arguments?.getInt(Constant.LEAGUE_ID_KEY)}")
    }

    companion object {
        fun newInstance(playerId: Int?, leagueId: Int?): PlayedStatisticFragment =
            PlayedStatisticFragment().apply {
                arguments = Bundle().apply {
                    if (playerId != null) {
                        putInt(Constant.PLAYER_ID_KEY, playerId)
                    }
                    if (leagueId != null) {
                        putInt(Constant.LEAGUE_ID_KEY, leagueId)
                    }
                }
            }
    }
}
