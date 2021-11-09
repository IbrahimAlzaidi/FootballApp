package com.example.footballapp.ui.leagueDetails.matches

import com.example.footballapp.R
import com.example.footballapp.model.response.schedulerMatch.SchedulerMatchInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class MatchAdapter(items: List<SchedulerMatchInfo>, listener: OnClickListener?) :
    BaseAdapter<SchedulerMatchInfo>(items, listener, R.layout.matches_item)