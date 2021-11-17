package com.example.footballapp.ui.home.matchScheduled

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchScheduledViewModel : BaseViewModel() {
    val matchScheduled = repository.getLatestMatchScheduled().asLiveData()
}
