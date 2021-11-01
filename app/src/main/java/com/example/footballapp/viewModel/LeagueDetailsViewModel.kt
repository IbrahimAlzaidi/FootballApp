package com.example.footballapp.viewModel

import androidx.lifecycle.asLiveData
import com.example.footballapp.viewModel.base.BaseViewModel

class LeagueDetailsViewModel: BaseViewModel() {
    val matchDetails = repository.getLeaguesInfo().asLiveData()
}
