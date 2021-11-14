package com.example.footballapp.ui.home.matchScheduled

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchScheduledViewModel(state: SavedStateHandle) : BaseViewModel(state) {
    val matchScheduled = repository.getLatestMatchScheduled(leagueId = null).asLiveData()
}
