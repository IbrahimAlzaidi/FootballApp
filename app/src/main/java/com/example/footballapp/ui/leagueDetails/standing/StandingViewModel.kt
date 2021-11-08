package com.example.footballapp.ui.leagueDetails.standing

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class StandingViewModel(arg: Int?) : BaseViewModel() {
    val standingTeam = arg?.let { repository.getStandingTeams(leagueId = it).asLiveData() }
}
