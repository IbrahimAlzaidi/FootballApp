package com.example.footballapp.ui.clubDetails.clubInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubInformationViewModel(teamId: Int?= null, leagueId: Int?= null) : BaseViewModel() {

    val clubInformation =
        leagueId?.let { leagueId ->
        teamId?.let { teamId ->
            repository.getStadiumInfo(
                teamId = teamId,
                leagueId = leagueId
            ).asLiveData()
        }
    }
}
