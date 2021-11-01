package com.example.footballapp.viewModel

import com.example.footballapp.model.response.liveMatches.MatchesResponse
import com.example.footballapp.ui.home.MatchInteractionListener

class MatchDetailsViewModel: BaseViewModel() , MatchInteractionListener {
    override fun onMatchSelected(match: MatchesResponse) {
        TODO("Not yet implemented")
    }
}
