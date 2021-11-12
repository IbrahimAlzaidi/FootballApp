package com.example.footballapp.ui.leagueDetails.matches

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class MatchesFragment(private val args: Int?) :
    BaseFragment<FragmentMatchesBinding, MatchesViewModel>(R.layout.fragment_matches), OnClickListener{
    override fun setup() {
        val matchScheduledAdapter = MatchAdapter(emptyList(),this)
        binding.matchScheduledRecycler.adapter = matchScheduledAdapter
    }

    override fun getViewModel() = MatchesViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int?) {
        navigate(LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToMatchDetailsFragment(id))
    }
    override val arg: Int?
        get() = args
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
