package com.example.footballapp.ui.clubDetails.squadInfo

import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.OnClickListener

class SquadInfoViewModel(val arg: Int?, val leagueId: Int?) : BaseViewModel(),
    OnClickListener {
    val team = arg?.let { repository.getTeamPlayerInfo(teamId = it, null).asLiveData() }
    override fun onClickItem(id: Int) {
        navigate(ClubDetailsFragmentDirections.actionClubDetailsFragmentToPlayerDetailsFragment(id,arg!!,leagueId!!))
    }
    init {
        Log.i(TAG, "SquadInfoViewModel: team id $arg - league id $leagueId")
    }
}
