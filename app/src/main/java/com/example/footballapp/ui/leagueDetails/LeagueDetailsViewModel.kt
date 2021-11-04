package com.example.footballapp.ui.leagueDetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.standing.StandingTeamsInfo
import com.example.footballapp.ui.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LeagueDetailsViewModel(arg: Int?) : BaseViewModel() {
    private val _leagueDetails = MutableLiveData<StandingTeamsInfo?>()
    val leagueDetails: LiveData<StandingTeamsInfo?>
        get() = _leagueDetails

    init {
        getData(arg)
    }
    private fun getData(arg: Int?) {
        viewModelScope.launch {
            arg?.let { args ->
                repository.getStandingTeams(leagueId = args).collect { response ->
                    if (response is State.Success) {
                        response.toData()?.standingTeamsInfo?.map { standing ->
                            _leagueDetails.postValue(standing)
                        }
                    }
                }
            }
        }
    }
}
