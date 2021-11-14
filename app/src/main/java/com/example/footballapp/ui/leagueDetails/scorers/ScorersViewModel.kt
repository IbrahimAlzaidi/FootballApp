package com.example.footballapp.ui.leagueDetails.scorers

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.model.response.topScorers.TopScorersResponse
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG

class ScorersViewModel(val arg: Int?,val state: SavedStateHandle) : BaseViewModel(state) {
    val topScorers = arg?.let { repository.getTopScorers(leagueId = it).asLiveData() }

}
