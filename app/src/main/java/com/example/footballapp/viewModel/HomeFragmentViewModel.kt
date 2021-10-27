package com.example.footballapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.footballapp.model.Repository
import com.example.footballapp.model.response.teams.Squad
import com.example.footballapp.ui.home.TeamInteractionListener

class HomeFragmentViewModel: ViewModel() , TeamInteractionListener {
    private val repository = Repository()
    val teamInfo = repository.getTeamsInfo(1).asLiveData()

    override fun onItemClick(squad: Squad) {

    }
}
