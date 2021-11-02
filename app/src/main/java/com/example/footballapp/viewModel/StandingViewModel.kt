package com.example.footballapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.State
import com.example.footballapp.model.response.standing.Standing
import com.example.footballapp.util.Constant
import com.example.footballapp.viewModel.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class StandingViewModel : BaseViewModel() {

    private val _standingTeams2 = MutableLiveData<List<Standing>>()
    val standingTeams2: LiveData<List<Standing>> = _standingTeams2

    init {
        getData()
    }

    private fun getData() {
        viewModelScope.launch {
            repository.getStandingTeams(leagueId = 39, season = 2021).collect { it ->
                if (it is State.Success) {
                    it.toData()?.response?.map { Response ->
                        Response.league?.standings?.map { Standings ->
                            _standingTeams2.postValue(Standings)
                        }
                    }
                }

            }
        }
    }
}
