package com.example.footballapp.ui.leagueDetails.matches

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.ArgumentInteraction

class MatchesFragment(private val args: ArgumentInteraction): BaseFragment<FragmentMatchesBinding, MatchesViewModel>(R.layout.fragment_matches){
    override fun setup() {
        binding.viewModel = viewModel
        val matchScheduledAdapter = MatchScheduledAdapter(emptyList(),null)
        binding.matchScheduledRecycler.adapter = matchScheduledAdapter

    }
    override fun getViewModel()= MatchesViewModel::class.java
    override val arg: Int
        get() = args.getLeagueId()
}
