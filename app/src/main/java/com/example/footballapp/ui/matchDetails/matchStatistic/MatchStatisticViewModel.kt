package com.example.footballapp.ui.matchDetails.matchStatistic

import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.ui.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchStatisticViewModel(arg: Int?) : BaseViewModel() {
    val matchStatistic = arg?.let { repository.getMatchStatistic(it).asLiveData() }

    init {
        viewModelScope.launch {
            if (arg != null) {
                repository.getMatchStatistic(arg).collect {  }
            }
        }
    }

}
