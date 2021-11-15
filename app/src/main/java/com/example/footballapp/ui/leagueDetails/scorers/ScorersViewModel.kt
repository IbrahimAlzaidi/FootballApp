package com.example.footballapp.ui.leagueDetails.scorers

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ScorersViewModel(leagueId: Int?= null) : BaseViewModel() {
    val topScorers = leagueId?.let { repository.getTopScorers(leagueId = it).asLiveData() }
}
