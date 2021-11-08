package com.example.footballapp.ui.clubDetails

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubDetailsViewModel(teamID: Int?, leagueId: Int?) : BaseViewModel() {
    val stadiumInformation = teamID?.let { leagueId?.let { it1 -> repository.getStadiumInfo(leagueId = it1, teamId = it).asLiveData() } }
    val teamInformation = teamID?.let { leagueId?.let { it1 -> repository.getTeamInformation(leagueId = it1, teamId = it).asLiveData() } }
}
