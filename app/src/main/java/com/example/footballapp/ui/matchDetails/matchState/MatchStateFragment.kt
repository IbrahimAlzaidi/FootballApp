package com.example.footballapp.ui.matchDetails.matchState

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchStateBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel

class MatchStateFragment(private val matchID: Int?) :
    BaseFragment<FragmentMatchStateBinding, MatchStateViewModel>(R.layout.fragment_match_state) {

    override fun setup() {
        binding.viewModel = viewModel
        val matchStatisticInformation = MatchStateAdapter(emptyList())
        binding.myRecycle.adapter = matchStatisticInformation
    }

    override fun getViewModel() = MatchStateViewModel::class.java

    override val arg: Int?
        get() = matchID

    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
