package com.example.footballapp.ui.matchDetails.matchStatistic

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchStatisticViewModel(arg: Int?) : BaseViewModel() {
    val matchStatistic = arg?.let { repository.getMatchStatistic(it).asLiveData() }
}
