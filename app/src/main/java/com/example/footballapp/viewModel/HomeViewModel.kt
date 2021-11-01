package com.example.footballapp.viewModel

import androidx.lifecycle.asLiveData

class HomeViewModel: BaseViewModel(){
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    val matchLive = repository.getMatchesLive().asLiveData()

}
