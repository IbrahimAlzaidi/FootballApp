package com.example.footballapp.viewModel

import androidx.lifecycle.asLiveData
import com.example.footballapp.model.response.teams.Squad
import com.example.footballapp.ui.home.TeamInteractionListener

class HomeViewModel: BaseViewModel() , TeamInteractionListener {
    val teamInfo = repository.getCompetitions().asLiveData()
    override fun onItemClick(squad: Squad) {

    }
}
