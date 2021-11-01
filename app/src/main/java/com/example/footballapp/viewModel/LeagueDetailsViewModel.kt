package com.example.footballapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.State
import com.example.footballapp.model.response.standingTeam.Standing
import com.example.footballapp.util.Constant.TAG
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LeagueDetailsViewModel(seasonId: Int = 2021, leaguesId: Int) : BaseViewModel() {

    val standingTeams =
        repository.getStandingTeams(leagueId = leaguesId, season = seasonId).asLiveData()
    private val _standingTeams2 = MutableLiveData<Standing?>()
    val standingTeams2: LiveData<Standing?>
        get() = _standingTeams2

    init {
        Log.i(TAG, "LeagueDetailsViewModel:$seasonId - $leaguesId ")
        viewModelScope.launch {
            repository.getStandingTeams(leagueId = leaguesId, season = seasonId).collect { it ->
                if (it is State.Success) {
                    it.data?.response?.map { Response ->
                        Response.league?.standings?.map { Standings ->
                            Standings.map {
                                _standingTeams2.postValue(
                                    it
                                )
                            }
                        }
                    }
                    Log.i(TAG, "getStandingTeams: ${it.data?.response?.map { it.league?.logo }}")
                    it.data?.response?.map {
                        Log.i(
                            TAG,
                            "LeagueDetailsViewModel: ${it.league?.name}"
                        )
                    }
                }
            }
        }
    }
}
