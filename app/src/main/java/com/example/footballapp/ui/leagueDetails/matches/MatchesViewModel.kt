package com.example.footballapp.ui.leagueDetails.matches

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchesViewModel(arg: Int?,state: SavedStateHandle) : BaseViewModel(
    state
){
    val matchesScheduled = arg?.let { repository.getMatchesResultFT(leagueId = it).asLiveData() }
}
