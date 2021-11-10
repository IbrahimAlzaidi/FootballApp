package com.example.footballapp.ui.playerDetails

import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG

class PlayerDetailsViewModel(arg: Int? , val teamId:Int? , val leagueId:Int?) : BaseViewModel() {
    val playerData = repository.getTeamPlayerInfo(teamId = teamId!!, playerId = arg).asLiveData()
    val playerStatisticInfo =
        arg?.let { repository.getPlayerStatistic(playerId = it, leagueId = leagueId!!).asLiveData() }
    init {
        Log.i(TAG, "PlayerDetailsViewModel: arg $arg - teamId $teamId - leagueId $leagueId")
    }
}
