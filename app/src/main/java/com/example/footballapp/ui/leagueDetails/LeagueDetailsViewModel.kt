package com.example.footballapp.ui.leagueDetails

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class LeagueDetailsViewModel(arg: Int?) : BaseViewModel() {
    val leagueDetails = arg?.let { repository.getStandingTeams(leagueId = it).asLiveData() }
}
