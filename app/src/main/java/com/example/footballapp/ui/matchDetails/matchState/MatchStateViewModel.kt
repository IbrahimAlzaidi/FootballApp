package com.example.footballapp.ui.matchDetails.matchState

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.toMatchStatistic
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchStateViewModel(val arg: Int?) : BaseViewModel() {
    val matchStatistic = arg?.let { repository.getMatchStatistic(it).asLiveData() }
    private val _match = MutableLiveData<List<MatchResultData>>()
    val match: LiveData<List<MatchResultData>>
        get() = _match

    init {
        viewModelScope.launch {
            arg?.let {
                repository.getMatchStatistic(it).collect { response ->
                    if (response is State.Success) {
                        _match.postValue(
                            response.data?.matchStatisticInfo?.toMatchStatistic()
                        )
                    }
                }
            }
        }
    }
}
