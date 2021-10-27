package com.example.footballapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.footballapp.model.Repository

class HomeFragmentViewModel: ViewModel() {
    private val repository = Repository()
    val teamInfo = repository.getTeamsInfo(1).asLiveData()
}