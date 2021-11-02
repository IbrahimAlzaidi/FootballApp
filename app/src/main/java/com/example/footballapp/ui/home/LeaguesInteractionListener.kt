package com.example.footballapp.ui.home

import android.view.View
import com.example.footballapp.ui.base.BaseInteractionListener

interface LeaguesInteractionListener : BaseInteractionListener {
    fun onLeagueSelected(seasonId:Int,leagueId:Int)
}
