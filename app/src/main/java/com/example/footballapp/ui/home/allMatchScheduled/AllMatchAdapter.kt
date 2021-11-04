package com.example.footballapp.ui.home.allMatchScheduled

import com.example.footballapp.R
import com.example.footballapp.model.response.latestMatchScheduled.Response
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.ui.home.OnClickMatch

class AllMatchAdapter(items: List<Response>, listener: OnClickMatch) :
    BaseAdapter<Response>(items,listener, R.layout.all_match_scheduled_item) {
}
