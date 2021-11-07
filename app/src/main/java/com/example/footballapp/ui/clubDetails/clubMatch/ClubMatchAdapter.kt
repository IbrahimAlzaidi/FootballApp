package com.example.footballapp.ui.clubDetails.clubMatch

import com.example.footballapp.R
import com.example.footballapp.model.response.teamCurrrenMatch.Response
import com.example.footballapp.util.OnClickListener

class ClubMatchAdapter(items: List<Response>, listener: OnClickListener?) :
    com.example.footballapp.ui.base.BaseAdapter<Response>(
        items,
        listener,
        R.layout.club_match_palyed_item,
    ) {
}
