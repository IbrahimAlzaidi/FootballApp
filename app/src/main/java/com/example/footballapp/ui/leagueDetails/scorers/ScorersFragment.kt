package com.example.footballapp.ui.leagueDetails.scorers

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentScorersBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel

class ScorersFragment(private val args: Int?): BaseFragment<FragmentScorersBinding, ScorersViewModel>
    (R.layout.fragment_scorers){
    override fun setup() {
        binding.viewModel = viewModel
        val topScoreAdapter = ScorersAdapter(emptyList(),viewModel)
        binding.topScoreRecycler.adapter = topScoreAdapter
    }

    override fun getViewModel()= ScorersViewModel::class.java
    override val arg: Int?
        get() = args
    override val leagueId: Int?
        get() = null

}
