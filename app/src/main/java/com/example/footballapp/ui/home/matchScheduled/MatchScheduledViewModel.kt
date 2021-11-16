package com.example.footballapp.ui.home.matchScheduled

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.response.matchScheduled.MatchScheduledInfo
import com.example.footballapp.model.response.matchStatistic.MatchStatisticInfo
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchScheduledViewModel : BaseViewModel() {
    val matchScheduled = repository.getLatestMatchScheduled().asLiveData()
    private val _matchInfo = MutableLiveData<List<MatchScheduledInfo?>>()
    val matchInfo: LiveData<List<MatchScheduledInfo?>>
        get() = _matchInfo

    init {
        getLeagueMatch()
    }

    private fun getLeagueMatch() {
        viewModelScope.launch {
            repository.getLatestMatchScheduled().collect { response ->
                _matchInfo.postValue(response.toData()?.matchScheduledInfo?.filter {
                    it.league?.country != "World" && it.league?.name != "I Liga - Women"
                })
                Log.i(TAG, "getLeagueMatch:---------World.. ${_matchInfo.value}")
            }
        }
    }
}
