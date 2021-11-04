package com.example.footballapp.ui.leagueDetails.standing

import com.example.footballapp.R
import com.example.footballapp.model.response.standing.StandingTeamsInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class StandingAdapter(items: List<StandingTeamsInfo>, listener: OnClickListener?) :
BaseAdapter<StandingTeamsInfo>(items,listener, R.layout.teams_standing_item)
