package com.example.footballapp.ui.matchDetails

import com.example.footballapp.R
import com.example.footballapp.model.response.matchStatistic.MatchStatisticInfo
import com.example.footballapp.ui.base.BaseAdapter

class MatchDetailsAdapter(items:List<MatchStatisticInfo>) : BaseAdapter<MatchStatisticInfo>(items,null,
    R.layout.match_statistics_item){
}
