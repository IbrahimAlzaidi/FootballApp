package com.example.footballapp.ui.clubDetails.clubMatch

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubMatchPlayedViewModel(arg: Int?) : BaseViewModel() {
    val currentMatchPlayed = repository.getTeamMatchPlayed(teamId = arg).asLiveData()
}
