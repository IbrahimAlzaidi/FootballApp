package com.example.footballapp.ui.leagueDetails.matches

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchesViewModel(leagueId: Int?) : BaseViewModel(
){
    val matchesScheduled = leagueId?.let { repository.getMatchesResultFT(leagueId = it).asLiveData() }
}
