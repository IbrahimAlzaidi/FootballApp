package com.example.footballapp.ui.playerDetails.matchPlayedStatistic

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class PlayedStatisticViewModel(playerId: Int? = null, leagueId: Int? = null) : BaseViewModel() {
    val playerStatisticInfo = playerId?.let { playerId ->
        leagueId?.let { leagueId ->
            repository.getPlayerStatistic(
                playerId = playerId,
                leagueId = leagueId
            ).asLiveData()
        }
    }
}
