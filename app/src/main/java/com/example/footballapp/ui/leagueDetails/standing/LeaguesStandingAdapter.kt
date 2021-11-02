package com.example.footballapp.ui.leagueDetails.standing

import com.example.footballapp.R
import com.example.footballapp.model.response.standing.StandingTeamInfo
import com.example.footballapp.ui.base.BaseAdapter

class LeaguesStandingAdapter(items: List<StandingTeamInfo>, listener: Nothing?) :
BaseAdapter<StandingTeamInfo>(items,listener, R.layout.leagues_standing_item)
