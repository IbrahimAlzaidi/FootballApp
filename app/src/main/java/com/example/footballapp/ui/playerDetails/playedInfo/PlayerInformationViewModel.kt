package com.example.footballapp.ui.playerDetails.playedInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class PlayerInformationViewModel(
    val playerId: Int?, teamId: Int?, leagueId: Int?
) : BaseViewModel() {
    val playerData =
        teamId?.let { repository.getTeamPlayerInfo(teamId = it, playerId = playerId).asLiveData() }
    val playerStatisticInfo =
        playerId?.let {
            leagueId?.let { league ->
                repository.getPlayerStatistic(
                    playerId = it,
                    leagueId = league
                ).asLiveData()
            }
        }
}
