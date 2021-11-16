package com.example.footballapp.ui.home.matchScheduled

import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchScheduledBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.HomeFragmentDirections
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.OnClickListener

class MatchScheduledFragment : BaseFragment<FragmentMatchScheduledBinding, MatchScheduledViewModel>
    (R.layout.fragment_match_scheduled), OnClickListener {

    override fun onStart() {
        super.onStart()
        val matchScheduledAdapter = MatchAdapter(emptyList(), this)
        binding.matchScheduledRecycler.adapter = matchScheduledAdapter
    }

    override fun getViewModel() = MatchScheduledViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int, leagueId: Int) {
        navigate(HomeFragmentDirections.actionHomeFragmentToClubDetailsFragment(teamId, leagueId))
        Log.i(TAG, "onClickItem -------- MatchScheduledFragment:$id --- $teamId --- $leagueId")
    }
}
