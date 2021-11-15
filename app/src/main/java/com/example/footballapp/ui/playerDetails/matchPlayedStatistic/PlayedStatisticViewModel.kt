package com.example.footballapp.ui.playerDetails.matchPlayedStatistic

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG

class PlayedStatisticViewModel(playerId: Int?, leagueId: Int?) : BaseViewModel(
) {
    val playerStatisticInfo = playerId?.let {
        repository.getPlayerStatistic(playerId = it, leagueId = leagueId!!).asLiveData()
    }
}
