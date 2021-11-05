package com.example.footballapp.ui.home.allMatchScheduled

import com.example.footballapp.R
import com.example.footballapp.model.response.matchScheduled.MatchScheduledInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class AllMatchAdapter(items: List<MatchScheduledInfo>) :
    BaseAdapter<MatchScheduledInfo>(items,null, R.layout.all_match_scheduled_item)