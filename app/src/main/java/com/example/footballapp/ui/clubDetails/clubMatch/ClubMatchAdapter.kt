package com.example.footballapp.ui.clubDetails.clubMatch

import com.example.footballapp.R
import com.example.footballapp.model.response.teamCurrentMatch.CurrentMatchInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class ClubMatchAdapter(items: List<CurrentMatchInfo>, listener: OnClickListener?) :
    BaseAdapter<CurrentMatchInfo>(items, listener, R.layout.match_club_played_item)
