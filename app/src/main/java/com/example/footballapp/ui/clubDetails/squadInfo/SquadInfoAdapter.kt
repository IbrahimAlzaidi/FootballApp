package com.example.footballapp.ui.clubDetails.squadInfo

import com.example.footballapp.R
import com.example.footballapp.model.response.squadPlayer.Player
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class SquadInfoAdapter(items: List<Player>, listener: OnClickListener) :
    BaseAdapter<Player>(items, listener, R.layout.team_player_item)
