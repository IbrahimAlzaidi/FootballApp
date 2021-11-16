package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.model.response.base.baseLeagueInfo.LeagueInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class LeaguesAdapter(items: List<LeagueInfo>, listener: OnClickListener) :
    BaseAdapter<LeagueInfo>(items, listener, R.layout.leagues_item)
