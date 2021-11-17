package com.example.footballapp.ui.home.matchScheduled

import com.example.footballapp.R
import com.example.footballapp.model.response.matchScheduled.MatchScheduledInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class MatchScheduledAdapter(items: List<MatchScheduledInfo>, listener: OnClickListener) :
    BaseAdapter<MatchScheduledInfo>(items, listener, R.layout.matches_scheduled_item)