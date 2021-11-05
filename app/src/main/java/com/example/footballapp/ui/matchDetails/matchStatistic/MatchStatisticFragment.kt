package com.example.footballapp.ui.matchDetails.matchStatistic

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchStatisticBinding
import com.example.footballapp.ui.base.BaseFragment


class MatchStatisticFragment(private val args: Int?) :
    BaseFragment<FragmentMatchStatisticBinding, MatchStatisticViewModel>(R.layout.fragment_match_statistic) {
    override fun setup() {
        binding.viewModel = viewModel
        val matchStatisticAdapter = MatchStatisticAdapter(emptyList())
        binding.matchStatisticRecycler.adapter = matchStatisticAdapter
    }

    override fun getViewModel(): Class<MatchStatisticViewModel> =
        MatchStatisticViewModel::class.java

    override val arg: Int?
        get() = null
}
