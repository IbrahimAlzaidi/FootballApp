package com.example.footballapp.ui.matchDetails.substitutes

import com.example.footballapp.R
import com.example.footballapp.model.response.lineup.SubstitutesPlayer
import com.example.footballapp.ui.base.BaseAdapter

class SubstitutesPlayerAdapter(items: List<SubstitutesPlayer>) :
   BaseAdapter<SubstitutesPlayer>(items, null, R.layout.substitutes_player_items)
