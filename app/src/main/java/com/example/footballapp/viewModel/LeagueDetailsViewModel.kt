package com.example.footballapp.viewModel

import androidx.lifecycle.asLiveData

class LeagueDetailsViewModel: BaseViewModel() {
    val matchDetails = repository.getLeaguesInfo().asLiveData()
}
