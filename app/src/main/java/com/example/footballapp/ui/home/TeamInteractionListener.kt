package com.example.footballapp.ui.home

import com.example.footballapp.model.response.teams.Squad
import com.example.footballapp.ui.base.BaseInteractionListener

interface TeamInteractionListener : BaseInteractionListener{
    fun onItemClick(squad: Squad)
}
