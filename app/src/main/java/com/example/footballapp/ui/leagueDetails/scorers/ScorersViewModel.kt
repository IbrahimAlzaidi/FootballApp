package com.example.footballapp.ui.leagueDetails.scorers

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel

class ScorersViewModel(arg: Int?) : BaseViewModel() {
  val topScorers = arg?.let { repository.getTopScorers(leagueId = it).asLiveData() }
}
