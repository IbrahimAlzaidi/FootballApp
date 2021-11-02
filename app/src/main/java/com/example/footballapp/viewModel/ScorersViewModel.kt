package com.example.footballapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.response.topScorers.TopScorers
import com.example.footballapp.viewModel.base.BaseViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class ScorersViewModel : BaseViewModel() {
    private val _topScorePlayerResponse = MutableLiveData<List<TopScorers?>>()
    val topScorePlayerResponse : LiveData<List<TopScorers?>> = _topScorePlayerResponse

    init {
        getData()
    }

    private fun getData() {
        viewModelScope.launch {
            repository.getTopScorers(39).collect {
                it.toData()?.response?.map {}
            }
        }
    }

    val topScoreResponse = repository.getTopScorers(39).asLiveData()

}
