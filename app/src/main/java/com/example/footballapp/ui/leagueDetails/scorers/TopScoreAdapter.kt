package com.example.footballapp.ui.leagueDetails.scorers

import com.example.footballapp.R
import com.example.footballapp.model.response.base.basePlayerStatistic.PlayerStatistic
import com.example.footballapp.ui.base.BaseAdapter

class TopScoreAdapter(items: List<PlayerStatistic>, listener: Nothing?) : BaseAdapter<PlayerStatistic>(
    items, listener, R.layout.top_score_item
)
