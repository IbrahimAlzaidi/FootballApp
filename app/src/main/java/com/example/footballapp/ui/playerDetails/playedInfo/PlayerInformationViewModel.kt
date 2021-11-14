package com.example.footballapp.ui.playerDetails.playedInfo

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class PlayerInformationViewModel(
    val playerId: Int?, teamId: Int?, leagueId: Int?,
    state: SavedStateHandle
) : BaseViewModel(state) {
    val playerData =
        repository.getTeamPlayerInfo(teamId = teamId!!, playerId = playerId!!).asLiveData()
    val playerStatisticInfo =
        playerId?.let {
            repository.getPlayerStatistic(playerId = playerId, leagueId = leagueId!!).asLiveData()
        }
}
