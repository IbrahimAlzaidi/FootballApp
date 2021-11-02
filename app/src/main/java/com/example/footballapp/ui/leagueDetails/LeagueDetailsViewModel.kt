package com.example.footballapp.ui.leagueDetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.standing.StandingTeamInfo
import com.example.footballapp.ui.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LeagueDetailsViewModel : BaseViewModel() {

    private val _standingTeams3 = MutableLiveData<StandingTeamInfo>()
    val standingTeams3: LiveData<StandingTeamInfo> = _standingTeams3

    init {
        getData()
    }

    private fun getData() {
        viewModelScope.launch {
            repository.getStandingTeams(leagueId = 39, season = 2021).collect {
                if (it is State.Success) {
                    it.toData()?.standingTeamInfo?.map { Response ->
                        _standingTeams3.postValue(Response)
                    }
                }

            }
        }
    }
}
