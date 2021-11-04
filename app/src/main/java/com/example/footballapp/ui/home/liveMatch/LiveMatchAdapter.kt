package com.example.footballapp.ui.home.liveMatch

import com.example.footballapp.R
import com.example.footballapp.model.response.liveMatches.LiveMatchDetails

import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class LiveMatchAdapter (items: List<LiveMatchDetails>, listener: OnClickListener?) :
    BaseAdapter<LiveMatchDetails>(items, listener, R.layout.live_matches_item)
