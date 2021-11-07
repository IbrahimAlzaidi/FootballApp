package com.example.footballapp.ui.clubDetails

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubDetailsViewModel(arg: Int?, leagueId: Int?) : BaseViewModel() {
//    app:ImageUrl="@{viewModel.teamInfo.venue.image !=null ?viewModel.teamInfo.venue.image:@string/stadium_logo}"
    val stadiumInformation = arg?.let { repository.getStadiumInfo(leagueId = leagueId!! , teamId = it).asLiveData() }
    val teamInformation = arg?.let { repository.getTeamInformation(leagueId = leagueId!! , teamId = it).asLiveData() }
}
