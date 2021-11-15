package com.example.footballapp.ui.matchDetails.matchState

import androidx.lifecycle.*
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.toMatchStatistic
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchStateViewModel(matchId: Int?) : BaseViewModel() {

    val matchStatistic = matchId?.let { repository.getMatchStatistic(it).asLiveData() }

    private val _match = MutableLiveData<List<MatchResultData?>>()

    val match: LiveData<List<MatchResultData?>>
        get() = _match

    init {
        viewModelScope.launch {
            matchId?.let {
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
