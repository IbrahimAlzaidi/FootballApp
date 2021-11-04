package com.example.footballapp.ui.leagueDetails.standing

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.standing.Standing
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class StandingViewModel(arg: Int?) : BaseViewModel() {
    private val _standingTeam = MutableLiveData<List<Standing>>()
    val standingTeam: LiveData<List<Standing>> = _standingTeam
    init {
        getData(arg)
    }

    private fun getData(arg: Int?) {
        viewModelScope.launch {
            arg?.let { args ->
                repository.getStandingTeams(leagueId = args).collect { response ->
                    if (response is State.Success) {
                        response.toData()?.standingTeamsInfo?.map { standing ->
                            standing.league?.standings?.map { it ->
                                Log.i(TAG, "getData: ${it.joinToString { it.team?.name.toString() }}")
                                _standingTeam.postValue(it.sortedBy { it.rank })
                            }
                        }
                    }
                }
            }
        }
    }
}
