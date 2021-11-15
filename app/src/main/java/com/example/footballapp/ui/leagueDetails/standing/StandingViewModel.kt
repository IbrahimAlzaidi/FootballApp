package com.example.footballapp.ui.leagueDetails.standing

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant

class StandingViewModel(val leagueId: Int?) : BaseViewModel() {
    val standingTeam = leagueId?.let { repository.getStandingTeams(leagueId = it).asLiveData() }
}
