package com.example.footballapp.ui.scorers

import com.example.footballapp.R
import com.example.footballapp.model.response.topScorers.Response
import com.example.footballapp.ui.base.BaseAdapter

class TopScoreAdapter(items: List<Response>, listener: Nothing?) : BaseAdapter<Response>(
    items, listener, R.layout.top_score_item
)
