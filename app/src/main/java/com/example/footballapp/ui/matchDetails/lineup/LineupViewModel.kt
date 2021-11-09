package com.example.footballapp.ui.matchDetails.lineup

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.lineup.DataPlayer
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.toPlayerStart
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LineupViewModel(val arg: Int?) : BaseViewModel() {
    val lineupsData = arg?.let { repository.getMatchLineup(it).asLiveData() }

    private val _match = MutableLiveData<List<DataPlayer?>>()
    val match: LiveData<List<DataPlayer?>> = _match

    init {
        Log.i(TAG, "LineupViewModel: $arg")
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
