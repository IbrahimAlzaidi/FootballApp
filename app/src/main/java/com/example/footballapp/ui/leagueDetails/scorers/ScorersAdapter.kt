package com.example.footballapp.ui.leagueDetails.scorers

import com.example.footballapp.R
import com.example.footballapp.model.response.topScorers.TopScorersInfo
import com.example.footballapp.ui.base.BaseAdapter

class ScorersAdapter(items: List<TopScorersInfo>, listener: Nothing?) : BaseAdapter<TopScorersInfo>(
    items, listener, R.layout.top_score_item
)
