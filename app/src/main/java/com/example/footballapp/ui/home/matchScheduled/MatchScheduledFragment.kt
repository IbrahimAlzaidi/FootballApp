package com.example.footballapp.ui.home.matchScheduled

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchScheduledBinding
import com.example.footballapp.ui.base.BaseFragment

class MatchScheduledFragment :
    BaseFragment<FragmentMatchScheduledBinding, MatchScheduledViewModel>(R.layout.fragment_match_scheduled) {

    override fun setup() {
        binding.viewModel = viewModel
        val matchScheduledAdapter = MatchAdapter(emptyList())
        binding.matchScheduledRecycler.adapter = matchScheduledAdapter
    }

    override fun getViewModel() = MatchScheduledViewModel::class.java

    override val leagueId: Int?
        get() = null

    override val arg: Int?
        get() = null
}
