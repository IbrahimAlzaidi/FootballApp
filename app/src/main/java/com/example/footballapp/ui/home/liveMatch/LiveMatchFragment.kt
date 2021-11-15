package com.example.footballapp.ui.home.liveMatch

import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLiveMatchBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.HomeFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.OnClickListener

class LiveMatchFragment :
    BaseFragment<FragmentLiveMatchBinding, LiveMatchViewModel>(R.layout.fragment_live_match), OnClickListener{

    override fun setup() {
        val matchAdapter = LiveMatchAdapter(mutableListOf(), this)
        binding.matchRecycler.adapter = matchAdapter
    }

    override fun getViewModel() = LiveMatchViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int?, leagueId: Int?) {
        navigate(HomeFragmentDirections.actionHomeFragmentToMatchDetailsFragment(id))
    }
    override val leagueId: Int?
        get() = null
    override val arg: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
