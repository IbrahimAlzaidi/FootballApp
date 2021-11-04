package com.example.footballapp.ui.home.allMatchScheduled

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class AllMatchScheduledViewModel(arg: Int?) : BaseViewModel() {
    val allMatchScheduled = repository.getMatchesResult(39).asLiveData()
    val allMatchScheduled2 = repository.getLatestMatchScheduled(leagueId = null).asLiveData()

}
