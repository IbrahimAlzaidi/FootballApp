package com.example.footballapp.ui.clubDetails.squadInfo

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class SquadInfoViewModel(arg: Int?) : BaseViewModel(),
    OnClickListener {
    val team = arg?.let { repository.getTeamPlayerInfo(teamId = it, null).asLiveData() }
    override fun onClickItem(id: Int) {
        navigate(ClubDetailsFragmentDirections.actionClubDetailsFragmentToPlayerDetailsFragment(id))
    }
}
