package com.example.footballapp.ui.leagueDetails

import android.util.Log
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.response.standing.StandingTeamsResponse
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LeagueDetailsViewModel(arg: Int?, state: SavedStateHandle) : BaseViewModel(
    state
) {
    val leagueDetails = arg?.let { repository.getStandingTeams(leagueId = it).asLiveData() }


}
