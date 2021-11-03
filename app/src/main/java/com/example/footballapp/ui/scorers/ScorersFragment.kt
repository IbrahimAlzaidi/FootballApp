package com.example.footballapp.ui.scorers

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentScorersBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.ScorersViewModel

class ScorersFragment: BaseFragment<FragmentScorersBinding, ScorersViewModel>(R.layout.fragment_scorers){
    override fun setup() {
        binding.viewModel = viewModel
        val topScoreAdapter = ScorersAdapter(emptyList(),null)
        binding.topScoreRecycler.adapter = topScoreAdapter
    }

    override fun getViewModel()= ScorersViewModel::class.java
    override val arg: String?
        get() = null

}
