package com.example.footballapp.ui.home.liveMatch

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class LiveMatchViewModel(arg: Int?) : BaseViewModel() {
    val matchLive = repository.getMatchesLive().asLiveData()
}
