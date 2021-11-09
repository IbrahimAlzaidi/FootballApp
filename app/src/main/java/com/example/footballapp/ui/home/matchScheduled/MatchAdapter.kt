package com.example.footballapp.ui.home.matchScheduled

import com.example.footballapp.R
import com.example.footballapp.model.response.matchScheduled.MatchScheduledInfo
import com.example.footballapp.ui.base.BaseAdapter

class MatchAdapter(items: List<MatchScheduledInfo>) :
    BaseAdapter<MatchScheduledInfo>(items, null, R.layout.matches_scheduled_item)