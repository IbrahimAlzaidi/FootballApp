package com.example.footballapp.ui.leagueDetails.matches

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class MatchesViewModel(arg: Int?) : BaseViewModel() ,
    OnClickListener {
    val matchesScheduled = arg?.let { repository.getMatchesResultFT(leagueId = it).asLiveData() }

    override fun onClickItem(id: Int) {
        navigate(LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToMatchDetailsFragment(id))
    }
}
