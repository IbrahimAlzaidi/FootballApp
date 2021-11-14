package com.example.footballapp.ui.home.liveMatch

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class LiveMatchViewModel(state: SavedStateHandle) : BaseViewModel(state) {
    val matchLive = repository.getMatchesLive().asLiveData()
}
