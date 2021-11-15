package com.example.footballapp.ui.matchDetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchDetailsViewModel(matchId: Int?) : BaseViewModel() {
    val matchDetails = matchId?.let { repository.getAllMatchData(it).asLiveData() }

}
