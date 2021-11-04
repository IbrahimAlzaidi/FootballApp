package com.example.footballapp.ui.home.allMatchScheduled

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class AllMatchScheduledViewModel : BaseViewModel() {
    val allMatchScheduled = repository.getLatestMatchScheduled(leagueId = null).asLiveData()
}
