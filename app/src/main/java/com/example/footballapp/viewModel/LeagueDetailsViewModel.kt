package com.example.footballapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.State
import com.example.footballapp.model.response.standing.Standing
import com.example.footballapp.viewModel.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LeagueDetailsViewModel : BaseViewModel() {
    private val _standingTeams = MutableLiveData<Standing>()
    val standingTeams: List<List<MutableLiveData<Standing>>>
        get() = listOf(listOf(_standingTeams))

    init {
        viewModelScope.launch {
            repository.getStandingTeams(leagueId = 39).collect { dataResponse ->
                if (dataResponse is State.Success) {
                    dataResponse.data?.response?.map { response ->
                        response.league?.standings?.map { standing ->
                            standing.map { _standingTeams.postValue(it) }
                        }
                    }
                }
            }
        }
    }
}
