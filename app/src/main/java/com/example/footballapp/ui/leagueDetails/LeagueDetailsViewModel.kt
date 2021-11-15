package com.example.footballapp.ui.leagueDetails

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class LeagueDetailsViewModel(leagueId: Int?= null) : BaseViewModel() {
    val leagueDetails = leagueId?.let { repository.getStandingTeams(leagueId = it).asLiveData() }
}
