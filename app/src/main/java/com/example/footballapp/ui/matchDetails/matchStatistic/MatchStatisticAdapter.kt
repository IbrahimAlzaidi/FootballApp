package com.example.footballapp.ui.matchDetails.matchStatistic

import androidx.databinding.ViewDataBinding
import com.example.footballapp.R
import com.example.footballapp.model.response.matchStatistic.MatchStatisticInfo
import com.example.footballapp.ui.base.BaseAdapter

class MatchStatisticAdapter(items: List<MatchStatisticInfo>) :
    BaseAdapter<MatchStatisticInfo>(
        items = items,
        null,
        layoutId = R.layout.match_statistics_item
    ) {

}
