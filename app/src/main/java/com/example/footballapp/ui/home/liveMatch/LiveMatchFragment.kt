package com.example.footballapp.ui.home.liveMatch

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLiveMatchBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.HomeFragmentDirections
import com.example.footballapp.util.OnClickListener

class LiveMatchFragment :
    BaseFragment<FragmentLiveMatchBinding, LiveMatchViewModel>(R.layout.fragment_live_match),
    OnClickListener {

    override fun onStart() {
        super.onStart()
        val matchAdapter = LiveMatchAdapter(mutableListOf(), this)
        binding.matchRecycler.adapter = matchAdapter
    }

    override fun getViewModel() = LiveMatchViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int, leagueId: Int) {
        navigate(HomeFragmentDirections.actionHomeFragmentToMatchDetailsFragment(id))
    }
}
