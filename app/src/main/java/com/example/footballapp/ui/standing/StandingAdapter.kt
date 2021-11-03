package com.example.footballapp.ui.standing

import com.example.footballapp.R
import com.example.footballapp.model.response.standing.Response
import com.example.footballapp.ui.base.BaseAdapter

class StandingAdapter(items: List<Response>, listener: Nothing?) :
BaseAdapter<Response>(items,listener, R.layout.leagues_standing_item)
