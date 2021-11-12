package com.example.footballapp.ui.clubDetails.squadInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class SquadInfoViewModel(val arg: Int?, val leagueId: Int?) : BaseViewModel() {
    val team = arg?.let { repository.getTeamPlayerInfo(teamId = it, null).asLiveData() }
}
