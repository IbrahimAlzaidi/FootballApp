package com.example.footballapp.ui.clubDetails.squadInfo

import com.example.footballapp.R
import com.example.footballapp.model.response.squadPlayer.Player
import com.example.footballapp.ui.base.BaseAdapter

class SquadInfoAdapter(items: List<Player>) :
    BaseAdapter<Player>(items, null, R.layout.team_player_item) {}
