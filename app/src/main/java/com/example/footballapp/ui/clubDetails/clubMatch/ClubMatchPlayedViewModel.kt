package com.example.footballapp.ui.clubDetails.clubMatch

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubMatchPlayedViewModel(arg: Int?, state: SavedStateHandle) : BaseViewModel(state) {
    val currentMatchPlayed = arg?.let { repository.getTeamMatchPlayed(teamId = it).asLiveData() }
}
