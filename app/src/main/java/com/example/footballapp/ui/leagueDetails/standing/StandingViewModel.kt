package com.example.footballapp.ui.leagueDetails.standing

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class StandingViewModel(val leagueId: Int?, state: SavedStateHandle) : BaseViewModel(state) {
    val standingTeam = leagueId?.let { repository.getStandingTeams(leagueId = it).asLiveData() }
}
