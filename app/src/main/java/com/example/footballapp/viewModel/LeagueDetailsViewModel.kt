package com.example.footballapp.viewModel

import androidx.lifecycle.asLiveData

class LeagueDetailsViewModel: BaseViewModel() {

    val leagueDetails = repository.getStandingTeams(leagueId = 39).asLiveData()
}
