package com.example.footballapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.State
import com.example.footballapp.model.response.topScorers.TopScorers
import com.example.footballapp.viewModel.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class ScorersViewModel : BaseViewModel() {

    val topScoreResponse = repository.getTopScorers(39).asLiveData()

}
