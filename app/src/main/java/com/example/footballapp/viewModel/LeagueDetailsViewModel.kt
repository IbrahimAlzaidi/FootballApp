package com.example.footballapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.State
import com.example.footballapp.model.response.standing.Response
import com.example.footballapp.viewModel.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LeagueDetailsViewModel : BaseViewModel() {

    private val _standingTeams3 = MutableLiveData<Response>()
    val standingTeams3: LiveData<Response> = _standingTeams3

    init {
        getData()
    }

    private fun getData() {
        viewModelScope.launch {
            repository.getStandingTeams(leagueId = 39, season = 2021).collect {
                if (it is State.Success) {
                    it.toData()?.response?.map { Response ->
                        _standingTeams3.postValue(Response)
                    }
                }

            }
        }
    }
}
