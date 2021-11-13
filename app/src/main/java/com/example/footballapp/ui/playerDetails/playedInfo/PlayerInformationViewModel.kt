package com.example.footballapp.ui.playerDetails.playedInfo

import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant
import com.example.footballapp.util.Constant.TAG

class PlayerInformationViewModel(val playerId: Int?, teamId: Int?,leagueId:Int?):BaseViewModel() {
    val playerData = repository.getTeamPlayerInfo(teamId = teamId!!, playerId = playerId!!).asLiveData()
    val playerStatisticInfo =
        playerId?.let { repository.getPlayerStatistic(playerId = playerId,leagueId = leagueId!!).asLiveData() }
}
