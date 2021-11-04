package com.example.footballapp.ui.home.liveMatch

import com.example.footballapp.ui.base.BaseInteractionListener

interface MatchInteractionListener: BaseInteractionListener {
    fun onMatchSelected(matchId: Int)
}
