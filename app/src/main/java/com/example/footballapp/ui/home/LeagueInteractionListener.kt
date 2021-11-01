package com.example.footballapp.ui.home

import com.example.footballapp.ui.base.BaseInteractionListener


interface LeagueInteractionListener: BaseInteractionListener{
    fun onLeagueSelected(leagueId: Int)
}
