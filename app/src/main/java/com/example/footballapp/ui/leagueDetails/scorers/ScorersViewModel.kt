package com.example.footballapp.ui.leagueDetails.scorers

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ScorersViewModel : BaseViewModel() {
    val topScoreResponse = repository.getTopScorers(39).asLiveData()

}
