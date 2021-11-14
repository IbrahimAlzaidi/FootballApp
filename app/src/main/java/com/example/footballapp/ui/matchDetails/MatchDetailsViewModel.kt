package com.example.footballapp.ui.matchDetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchDetailsViewModel(arg: Int?, state: SavedStateHandle) : BaseViewModel(state) {
    val matchDetails = arg?.let { repository.getAllMatchData(it).asLiveData() }

}
