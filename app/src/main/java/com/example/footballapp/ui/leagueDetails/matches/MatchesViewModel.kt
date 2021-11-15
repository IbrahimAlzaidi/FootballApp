package com.example.footballapp.ui.leagueDetails.matches

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class MatchesViewModel(leagueId: Int?= null) : BaseViewModel(){
    val matchesScheduled = leagueId?.let { repository.getMatchesResultFT(leagueId = it).asLiveData() }
}
