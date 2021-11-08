package com.example.footballapp.ui.matchDetails.lineup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.lineup.DataPlayer
import com.example.footballapp.model.response.lineup.LineupResponse
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.toPlayerStart
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LineupViewModel(val arg: Int?) : BaseViewModel() {
    val data = repository.getMatchLineup(arg!!).asLiveData()

    private val _matchStatistic = MutableLiveData<State<LineupResponse?>>()
    val matchStatistic: LiveData<State<LineupResponse?>> = _matchStatistic
    private val _match = MutableLiveData<List<DataPlayer>>()
    val match: LiveData<List<DataPlayer>> = _match

    init {
        viewModelScope.launch {
            if (arg != null) {
                repository.getMatchLineup(arg).collect {
                    if (it is State.Success) {
                        _match.postValue(it.toData()?.lineupInfo?.toPlayerStart())
                    }
                }
            }
        }
    }
}
