package com.example.footballapp.ui.leagueDetails.scorers

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentScorersBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.ArgumentInteraction

class ScorersFragment(private val args: ArgumentInteraction): BaseFragment<FragmentScorersBinding, ScorersViewModel>(R.layout.fragment_scorers){
    override fun setup() {
        binding.viewModel = viewModel
        val topScoreAdapter = ScorersAdapter(emptyList(),null)
        binding.topScoreRecycler.adapter = topScoreAdapter
    }

    override fun getViewModel()= ScorersViewModel::class.java
    override val arg: Int
        get() = args.getLeagueId()

}
