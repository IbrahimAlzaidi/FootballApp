package com.example.footballapp.ui.matchDetails.lineup

import android.util.Log
import androidx.lifecycle.*
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.lineup.DataPlayer
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.toPlayerStart
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LineupViewModel(matchId: Int?) : BaseViewModel() {

    val lineupsData = matchId?.let { repository.getMatchLineup(it).asLiveData() }

    private val _match = MutableLiveData<List<DataPlayer?>>()

    val match: LiveData<List<DataPlayer?>>
        get() = _match

    init {
        viewModelScope.launch {
            if (matchId != null) {
                repository.getMatchLineup(matchId).collect {
                    if (it is State.Success) {
                        _match.postValue(it.toData()?.lineupInfo?.toPlayerStart())
                    }
                }
            }
        }
    }
}
