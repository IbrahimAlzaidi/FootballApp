package com.example.footballapp.ui.clubDetails.clubMatch

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class ClubMatchPlayedViewModel(arg: Int?) : BaseViewModel() ,
    OnClickListener {
    val currentMatchPlayed = arg?.let { repository.getTeamMatchPlayed(teamId = it).asLiveData() }
    override fun onClickItem(id: Int) {
        navigate(ClubDetailsFragmentDirections.actionClubDetailsFragmentToMatchDetailsFragment(id))
    }
}
