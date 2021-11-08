package com.example.footballapp.ui.matchDetails

import androidx.lifecycle.*
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.model.response.matchStatistic.MatchStatisticResponse
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.toMatchStatistic
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchDetailsViewModel(val arg: Int?) : BaseViewModel() {
    val data = repository.getAllMatchData(arg).asLiveData()
}
