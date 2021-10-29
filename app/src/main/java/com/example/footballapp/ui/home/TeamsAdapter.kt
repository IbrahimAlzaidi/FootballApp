package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.model.response.teams.Squad
import com.example.footballapp.ui.base.BaseAdapter

class TeamsAdapter(items: List<Squad>, listener: Nothing?) :
    BaseAdapter<Squad>(items, listener,R.layout.item) {
}
