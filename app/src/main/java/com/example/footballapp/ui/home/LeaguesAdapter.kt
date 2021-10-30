package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.model.response.leagues.Response
import com.example.footballapp.ui.base.BaseAdapter

class LeaguesAdapter(items: List<Response>, listener: Nothing?) :
    BaseAdapter<Response>(items, listener,R.layout.item_leagues)
