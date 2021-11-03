package com.example.footballapp.ui.leagueDetails.matches

import com.example.footballapp.R
import com.example.footballapp.model.response.schedulerMatch.SchedulerMatchInfo
import com.example.footballapp.ui.base.BaseAdapter

class MatchScheduledAdapter(items: List<SchedulerMatchInfo>, listener: Nothing?) :
    BaseAdapter<SchedulerMatchInfo>(
        items, listener,
        R.layout.match_scheduld_item
    ) {
}
