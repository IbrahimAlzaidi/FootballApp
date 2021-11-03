package com.example.footballapp.ui.standing

import com.example.footballapp.R
import com.example.footballapp.model.response.standing.StandingTeamsInfo
import com.example.footballapp.ui.base.BaseAdapter

class StandingAdapter(items: List<StandingTeamsInfo>, listener: Nothing?) :
BaseAdapter<StandingTeamsInfo>(items,listener, R.layout.leagues_standing_item)
