package com.example.footballapp.ui.playerDetails.playedInfo

import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant
import com.example.footballapp.util.Constant.TAG

class PlayerInformationViewModel(val arg: Int?, league: Int?,teamId:Int?):BaseViewModel() {
    val playerData = teamId?.let { repository.getTeamPlayerInfo(teamId = it, playerId = arg).asLiveData() }
    val playerStatisticInfo =
        arg?.let { repository.getPlayerStatistic(playerId = it,leagueId = league!!).asLiveData() }

    init {
        Log.i(Constant.TAG, "PlayerInformationViewModel____________Setup: $arg $league $teamId")
    }
}
