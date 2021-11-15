package com.example.footballapp.ui.playerDetails

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class PlayerDetailsViewModel(playerId: Int?= null,teamId:Int?= null,leagueId:Int?= null) : BaseViewModel(
) {
    val playerData = teamId?.let { repository.getTeamPlayerInfo(teamId = it, playerId = playerId).asLiveData() }
    val playerStatisticInfo =
        playerId?.let { leagueId?.let { it1 -> repository.getPlayerStatistic(playerId = it, leagueId = it1).asLiveData() } }
}
