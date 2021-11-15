package com.example.footballapp.ui.clubDetails.squadInfo

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant
import com.example.footballapp.util.Constant.TAG

class SquadInfoViewModel(teamId : Int?) : BaseViewModel(
) {
    val team = teamId?.let { repository.getTeamPlayerInfo(teamId = it).asLiveData() }
    init {
    Log.i(TAG, "SquadInfoViewModel: $teamId")
    }
}
