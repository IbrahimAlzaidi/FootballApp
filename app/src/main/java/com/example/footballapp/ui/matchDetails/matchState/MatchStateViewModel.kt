package com.example.footballapp.ui.matchDetails.matchState

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.model.response.matchStatistic.MatchStatisticResponse
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.toMatchStatistic
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchStateViewModel(val arg: Int?) :BaseViewModel() {
    private val _matchStatistic = MutableLiveData<State<MatchStatisticResponse?>>()
    val matchStatistic: LiveData<State<MatchStatisticResponse?>> = _matchStatistic
    private val _match = MutableLiveData<List<MatchResultData>>()
    val match: LiveData<List<MatchResultData>> = _match

    init {
        getData()
        Log.i(TAG, "MatchStateViewModel:$arg ")
    }

    private fun getData() {
        viewModelScope.launch {
            arg?.let {
                repository.getMatchStatistic(it).collect { response ->
                    _matchStatistic.postValue(response)
                }
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
