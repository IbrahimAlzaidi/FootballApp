package com.example.footballapp.ui.home.liveMatch

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLiveMatchBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.HomeFragmentDirections


class LiveMatchFragment(override val arg: Int?) :
    BaseFragment<FragmentLiveMatchBinding, LiveMatchViewModel>(R.layout.fragment_live_match),
    MatchInteractionListener {

    override fun setup() {
        binding.viewModel = viewModel
        val matchAdapter = LiveMatchAdapter(mutableListOf(), this)
        binding.matchRecycler.adapter = matchAdapter
    }

    override fun getViewModel(): Class<LiveMatchViewModel> = LiveMatchViewModel::class.java

    override fun onMatchSelected(matchId: Int) {
        val action = LiveMatchFragmentDirections.actionLiveMatchFragmentToMatchDetailsFragment(matchId)
        this.findNavController().navigate(action)
    }
}
