package com.example.footballapp.ui.home

import com.example.footballapp.R
import com.example.footballapp.model.response.teams.Squad
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.ui.base.BaseInteractionListener

class TeamsAdapter(items: List<Squad>, listener: Nothing?) :
    BaseAdapter<Squad>(items, listener) {
    override val layoutId: Int
        get() = R.layout.item
}
