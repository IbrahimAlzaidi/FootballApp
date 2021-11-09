package com.example.footballapp.ui.playerDetails

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.squadPlayer.SquadPlayer
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class PlayerDetailsViewModel(arg: Int?) : BaseViewModel() {
    val playerData = repository.getTeamPlayerInfo(teamId = 33, playerId = arg).asLiveData()
    val playerStatisticInfo = arg?.let { repository.getPlayerStatistic(playerId = it,leagueId = 39).asLiveData()}
    init {
        Log.i(TAG, "PlayerDetailsViewModel:$arg ")
        viewModelScope.launch {
            if (arg != null) {
                repository.getPlayerStatistic(playerId = arg,leagueId = 39).collect{ it ->
                    it.toData()?.playerStatisticInfo?.joinToString { it.statistics?.map {
                        Log.i(
                            TAG,
                            "PlayerDetailsViewModel:${it.games?.appearances} "
                        ) }.toString() }
                }
            }
        }
    }
}
