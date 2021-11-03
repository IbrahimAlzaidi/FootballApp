package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.model.response.liveMatches.LiveMatchDetails

import com.example.footballapp.ui.base.BaseAdapter

class MatchAdapter (items: List<LiveMatchDetails>, listener: MatchInteractionListener) :
    BaseAdapter<LiveMatchDetails>(items, listener, R.layout.item_matches)
