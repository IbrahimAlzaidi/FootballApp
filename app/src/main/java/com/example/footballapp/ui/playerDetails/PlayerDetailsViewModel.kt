package com.example.footballapp.ui.playerDetails

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG

class PlayerDetailsViewModel(playerId: Int?, val teamId:Int?, val leagueId:Int?) : BaseViewModel(
) {
    val playerData = teamId?.let { repository.getTeamPlayerInfo(teamId = it, playerId = playerId).asLiveData() }
    val playerStatisticInfo =
        playerId?.let { repository.getPlayerStatistic(playerId = it, leagueId = leagueId!!).asLiveData() }
}
