package com.example.footballapp.ui.home.liveMatch

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLiveMatchBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel

class LiveMatchFragment :
    BaseFragment<FragmentLiveMatchBinding, LiveMatchViewModel>(R.layout.fragment_live_match){

    override fun setup() {
        binding.viewModel = viewModel
        val matchAdapter = LiveMatchAdapter(mutableListOf(), viewModel)
        binding.matchRecycler.adapter = matchAdapter
    }

    override fun getViewModel() = LiveMatchViewModel::class.java

    override val leagueId: Int?
        get() = null
    override val arg: Int?
        get() = null

}
