package com.example.footballapp.ui.leagueDetails.matches

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.liveMatch.MatchInteractionListener
import com.example.footballapp.ui.leagueDetails.ArgumentInteraction

class MatchesFragment(private val args: ArgumentInteraction) :
    BaseFragment<FragmentMatchesBinding, MatchesViewModel>(R.layout.fragment_matches),
    MatchInteractionListener {
    override fun setup() {
        binding.viewModel = viewModel
        val matchScheduledAdapter = MatchAdapter(emptyList(), this)
        binding.matchScheduledRecycler.adapter = matchScheduledAdapter

    }

    override fun onMatchSelected(matchId: Int) {
        val action = MatchesFragmentDirections.actionMatchesFragmentToMatchDetailsFragment(matchId)
        this.findNavController().navigate(action)
    }

    override fun getViewModel() = MatchesViewModel::class.java
    override val arg: Int
        get() = args.getLeagueId()


}
