package com.example.footballapp.ui.matchDetails.substitutes

import com.example.footballapp.R
import com.example.footballapp.model.response.lineup.SubstitutesPlayer

class SubstitutesPlayerAdapter(items: List<SubstitutesPlayer>) :
    com.example.footballapp.ui.base.BaseAdapter<SubstitutesPlayer>(
        items,
        null,
        R.layout.substitutes_player_items
    ) {
}
