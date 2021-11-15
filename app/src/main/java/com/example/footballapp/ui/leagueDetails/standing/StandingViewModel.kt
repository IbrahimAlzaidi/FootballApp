package com.example.footballapp.ui.leagueDetails.standing

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class StandingViewModel(leagueId: Int?= null) : BaseViewModel() {
    val standingTeam = leagueId?.let { repository.getStandingTeams(leagueId = it).asLiveData() }
}
