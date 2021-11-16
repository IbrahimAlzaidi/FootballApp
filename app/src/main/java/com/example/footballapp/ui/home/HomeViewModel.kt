package com.example.footballapp.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.response.base.baseLeagueInfo.LeagueInfo
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModel: BaseViewModel() {
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    private val _leagues = MutableLiveData<List<LeagueInfo?>>()
    val leagues: LiveData<List<LeagueInfo?>>
        get() = _leagues

    init {
        getLeagueMatch()
    }

    private fun getLeagueMatch() {
        viewModelScope.launch {
            repository.getLeaguesInfo().collect { response ->
                _leagues.postValue(response.toData()?.leaguesDetails?.filter {
                    it.country?.name != "World" && it.league?.type != "Cup"
                })
                Log.i(Constant.TAG, "getLeagueMatch:---------World.. ${_leagues.value}")
            }
        }
    }
}
