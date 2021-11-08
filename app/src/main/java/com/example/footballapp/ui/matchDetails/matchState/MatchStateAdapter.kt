package com.example.footballapp.ui.matchDetails.matchState

import com.example.footballapp.R
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.ui.base.BaseAdapter

class MatchStateAdapter(items: List<MatchResultData>) :
    BaseAdapter<MatchResultData>(items,null, R.layout.match_statistic_items) {
}
