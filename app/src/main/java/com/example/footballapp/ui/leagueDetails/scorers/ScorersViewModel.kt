package com.example.footballapp.ui.leagueDetails.scorers

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class ScorersViewModel(arg: Int?) : BaseViewModel(), OnClickListener {
    val topScorers = arg?.let { repository.getTopScorers(leagueId = it).asLiveData() }
    override fun onClickItem(id: Int) {
        navigate(
            LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToPlayerDetailsFragment(
                id
            )
        )
    }
}
