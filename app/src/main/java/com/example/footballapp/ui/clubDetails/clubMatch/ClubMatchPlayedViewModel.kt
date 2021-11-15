package com.example.footballapp.ui.clubDetails.clubMatch

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubMatchPlayedViewModel(teamId: Int?= null) : BaseViewModel() {
    val currentMatchPlayed = teamId?.let { repository.getTeamMatchPlayed(teamId = it).asLiveData() }
}
