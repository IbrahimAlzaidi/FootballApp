package com.example.footballapp.ui.home.liveMatch

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class LiveMatchViewModel : BaseViewModel() {
    val matchLive = repository.getMatchesLive().asLiveData()
}
