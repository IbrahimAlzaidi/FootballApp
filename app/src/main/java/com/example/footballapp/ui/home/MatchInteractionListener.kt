package com.example.footballapp.ui.home

import com.example.footballapp.ui.base.BaseInteractionListener

interface MatchInteractionListener: BaseInteractionListener {
    fun onMatchSelected(matchId: Int)
}