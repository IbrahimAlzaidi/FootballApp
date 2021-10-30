package com.example.footballapp.viewModel

import androidx.lifecycle.asLiveData
import com.example.footballapp.R
import com.example.footballapp.ui.home.TeamInteractionListener

class HomeViewModel: BaseViewModel() , TeamInteractionListener {
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    val matchLive = repository.getMatchesLive().asLiveData()
    val responseList = listOf(leaguesInfo.value?.toData()?.response)
}
