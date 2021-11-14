package com.example.footballapp.ui.clubDetails.clubInfo

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubInformationViewModel(teamId: Int?, leagueId: Int?, state: SavedStateHandle) : BaseViewModel(
    state
) {
    val clubInformation = leagueId?.let {
        teamId?.let { it1 ->
            repository.getStadiumInfo(teamId = it1, leagueId = it).asLiveData()
        }
    }
}
