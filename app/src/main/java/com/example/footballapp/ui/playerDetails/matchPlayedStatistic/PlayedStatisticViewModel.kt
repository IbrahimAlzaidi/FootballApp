package com.example.footballapp.ui.playerDetails.matchPlayedStatistic

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class PlayedStatisticViewModel(arg: Int?, leagueId: Int?):BaseViewModel() {
    val playerStatisticInfo = arg?.let { repository.getPlayerStatistic(playerId = it,leagueId = 39).asLiveData()}
}
