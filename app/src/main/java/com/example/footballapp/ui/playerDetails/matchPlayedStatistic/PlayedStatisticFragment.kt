package com.example.footballapp.ui.playerDetails.matchPlayedStatistic

import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayedStatisticBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant

class PlayedStatisticFragment(
    private val playerId: Int?,
    private val teamID: Int,
    private val leagueID: Int
) : BaseFragment<FragmentPlayedStatisticBinding, PlayedStatisticViewModel>(R.layout.fragment_played_statistic) {
    override fun setup() {

    }
    override fun getViewModel(): Class<PlayedStatisticViewModel> =
        PlayedStatisticViewModel::class.java

    override val arg: Int?
        get() = playerId
    override val leagueId: Int
        get() = leagueID
    override val teamId: Int
        get() = teamID
}
