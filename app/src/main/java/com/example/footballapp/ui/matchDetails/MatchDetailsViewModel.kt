package com.example.footballapp.ui.matchDetails

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchDetailsViewModel(val arg: Int?) : BaseViewModel() {

    val getMatchStatistics = arg?.let { repository.getMatchStatistic(it).asLiveData() }

    init {
//        data()
    }

//    private fun data() {
//        viewModelScope.launch {
//            if (arg != null) {
//                repository.getMatchStatistic(710556).collect {
//                    val homeTeam = it.toData()?.matchStatisticInfo?.get(0)?.team?.name
//                    val awayTeam = it.toData()?.matchStatisticInfo?.get(1)?.team?.name
//                    Log.i(TAG, "data: $homeTeam - $awayTeam")
//                }
//            }
//        }
//    }
}
