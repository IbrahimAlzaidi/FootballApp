package com.example.footballapp.ui.matchDetails.lineup

import com.example.footballapp.R
import com.example.footballapp.model.response.lineup.DataPlayer
import com.example.footballapp.ui.base.BaseAdapter

class LineupAdapter(items: List<DataPlayer>) :
    BaseAdapter<DataPlayer>(items, null, R.layout.lineup_match_item)
