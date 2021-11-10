package com.example.footballapp.ui.leagueDetails.standing

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class StandingViewModel(val arg: Int?) : BaseViewModel() ,OnClickListener{
    val standingTeam = arg?.let { repository.getStandingTeams(leagueId = it).asLiveData() }
    override fun onClickItem(id: Int) {
        arg?.let {
            LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToClubDetailsFragment(id,
                it
            )
        }?.let { navigate(it) }
    }

}
