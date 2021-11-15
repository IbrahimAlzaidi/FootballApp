package com.example.footballapp.ui.clubDetails.squadInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class SquadInfoViewModel(teamId : Int?= null) : BaseViewModel() {
    val team = teamId?.let { repository.getTeamPlayerInfo(teamId = it).asLiveData() }
}
