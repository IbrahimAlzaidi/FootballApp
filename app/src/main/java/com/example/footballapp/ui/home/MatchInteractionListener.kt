package com.example.footballapp.ui.home

import com.example.footballapp.model.response.liveMatches.MatchesResponse
import com.example.footballapp.ui.base.BaseInteractionListener


interface MatchInteractionListener : BaseInteractionListener{
    fun onMatchSelected(match: MatchesResponse)
}
