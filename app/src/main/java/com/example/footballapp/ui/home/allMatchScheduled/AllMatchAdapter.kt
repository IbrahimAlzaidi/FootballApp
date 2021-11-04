package com.example.footballapp.ui.home.allMatchScheduled

import com.example.footballapp.R
import com.example.footballapp.model.response.latestMatchScheduled.Response
import com.example.footballapp.model.response.matches.MatchInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.ui.home.liveMatch.MatchInteractionListener

class AllMatchAdapter(items: List<Response>, listener: MatchInteractionListener) :
    BaseAdapter<Response>(items,listener, R.layout.all_match_scheduled_item) {
}
