package com.example.footballapp.ui.home

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class HomeViewModel: BaseViewModel() {
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    val matchLive = repository.getMatchesLive().asLiveData()
}
