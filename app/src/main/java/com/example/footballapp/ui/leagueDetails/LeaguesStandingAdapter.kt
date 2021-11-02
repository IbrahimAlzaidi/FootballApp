package com.example.footballapp.ui.leagueDetails

import com.example.footballapp.R
import com.example.footballapp.ui.base.BaseAdapter

class LeaguesStandingAdapter(items: List<com.example.footballapp.model.response.standing.Standing>, listener: Nothing?) :
BaseAdapter<com.example.footballapp.model.response.standing.Standing>(items,listener, R.layout.leagues_standing_item)
