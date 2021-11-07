package com.example.footballapp.ui.clubDetails.squadInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class SquadInfoViewModel(val arg: Int?) : BaseViewModel() {
    val team = repository.getTeamPlayerInfo(teamId = arg).asLiveData()
}
