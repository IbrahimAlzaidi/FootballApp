package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.model.response.base.baseLeagueInfo.LeagueInfo
import com.example.footballapp.ui.base.BaseAdapter

class LeaguesAdapter(items: List<LeagueInfo>, listener: LeagueInteractionListener) :
    BaseAdapter<LeagueInfo>(items, listener,R.layout.item_leagues)
