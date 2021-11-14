package com.example.footballapp.ui.clubDetails.squadInfo

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class SquadInfoViewModel(val arg: Int?, val leagueId: Int?, state: SavedStateHandle) : BaseViewModel(
    state
) {
    val team = arg?.let { repository.getTeamPlayerInfo(teamId = it, null).asLiveData() }
}
