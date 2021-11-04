package com.example.footballapp.ui.home.liveMatch

import com.example.footballapp.R
import com.example.footballapp.model.response.liveMatches.LiveMatchDetails

import com.example.footballapp.ui.base.BaseAdapter

class LiveMatchAdapter (items: List<LiveMatchDetails>, listener: MatchInteractionListener) :
    BaseAdapter<LiveMatchDetails>(items, listener, R.layout.live_matches_item)
