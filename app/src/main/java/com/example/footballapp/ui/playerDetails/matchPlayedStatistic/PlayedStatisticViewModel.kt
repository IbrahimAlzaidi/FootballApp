package com.example.footballapp.ui.playerDetails.matchPlayedStatistic

import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG

class PlayedStatisticViewModel(arg: Int?, leagueId: Int?):BaseViewModel() {
    val playerStatisticInfo = arg?.let { repository.getPlayerStatistic(playerId = it,leagueId = leagueId!!).asLiveData()}
    init {
        Log.i(TAG, "PlayedStatisticViewModel: $arg - $leagueId ")
    }
}
