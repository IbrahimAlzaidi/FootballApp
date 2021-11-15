package com.example.footballapp.ui.playerDetails.playedInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class PlayerInformationViewModel(
    playerId: Int?= null,
    teamId: Int?= null,
    leagueId: Int?= null
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
