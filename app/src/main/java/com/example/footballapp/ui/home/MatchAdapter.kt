package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.model.response.liveMatches.LiveMatchesInfo

import com.example.footballapp.ui.base.BaseAdapter

class MatchAdapter (items: List<LiveMatchesInfo>, listener: MatchInteractionListener) :
    BaseAdapter<LiveMatchesInfo>(items, listener, R.layout.item_matches)
