package com.example.footballapp.viewModel

import androidx.lifecycle.asLiveData
import com.example.footballapp.viewModel.base.BaseViewModel

class HomeViewModel(arg: String?): BaseViewModel() {
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    val matchLive = repository.getMatchesLive().asLiveData()
}
