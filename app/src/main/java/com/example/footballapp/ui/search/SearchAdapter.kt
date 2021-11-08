package com.example.footballapp.ui.search

import com.example.footballapp.R
import com.example.footballapp.model.response.base.baseLeagueInfo.LeagueInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class SearchAdapter(item: List<LeagueInfo>, listener: OnClickListener) :
    BaseAdapter<LeagueInfo>(item,listener, R.layout.search_item)