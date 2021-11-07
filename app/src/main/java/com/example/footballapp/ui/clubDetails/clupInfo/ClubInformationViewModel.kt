package com.example.footballapp.ui.clubDetails.clupInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ClubInformationViewModel(arg: Int?, leagueId: Int?) : BaseViewModel() {
    val data = repository.getStadiumInfo(teamId = leagueId!!,leagueId = arg!!).asLiveData()
}
