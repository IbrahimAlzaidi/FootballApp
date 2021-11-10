package com.example.footballapp.ui.playerDetails.playedInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class PlayerInformationViewModel(val arg: Int?, teamId: Int?):BaseViewModel() {
    val playerData = repository.getTeamPlayerInfo(teamId = 33, playerId = arg).asLiveData()
    val playerStatisticInfo = arg?.let { repository.getPlayerStatistic(playerId = it,leagueId = 39).asLiveData()}
}
