package com.example.footballapp.ui.clubDetails

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubDetailsViewModel(teamID: Int? = null, leagueId: Int?= null) : BaseViewModel() {
    val stadiumInformation =
        teamID?.let { teamID ->
        leagueId?.let { leagueId ->
            repository.getStadiumInfo(
                leagueId = leagueId,
                teamId = teamID
            ).asLiveData()
        }
    }

    val teamInformation =
        teamID?.let { teamID ->
        leagueId?.let { leagueId ->
            repository.getTeamInformation(
                leagueId = leagueId,
                teamId = teamID
            ).asLiveData()
        }
    }
}
