package com.example.footballapp.ui.leagueDetails.standing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.standing.StandingTeamInfo
import com.example.footballapp.ui.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class StandingViewModel : BaseViewModel() {

    val standing = repository.getStandingTeams(leagueId = 39).asLiveData()
}