package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.model.response.liveMatches.MatchesResponse

import com.example.footballapp.ui.base.BaseAdapter

class MatchAdapter (items: List<MatchesResponse>, listener: Nothing?) :
    BaseAdapter<MatchesResponse>(items, listener, R.layout.item_matches) {
}
