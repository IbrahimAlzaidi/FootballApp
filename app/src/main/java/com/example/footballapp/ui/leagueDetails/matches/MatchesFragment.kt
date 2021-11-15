package com.example.footballapp.ui.leagueDetails.matches

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.OnClickListener

class MatchesFragment() :
    BaseFragment<FragmentMatchesBinding, MatchesViewModel>(R.layout.fragment_matches), OnClickListener{
    override fun setup() {
        val matchScheduledAdapter = MatchAdapter(emptyList(),this)
        binding.matchScheduledRecycler.adapter = matchScheduledAdapter

    }
    override fun onStart() {
        super.onStart()
        binding.viewModel = MatchesViewModel(arguments?.getInt(Constant.LEAGUE_ID_KEY))
    }

    override fun getViewModel() = MatchesViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int?, leagueId: Int?) {
        navigate(LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToMatchDetailsFragment(id))
    }

    companion object : InstantsFragments<MatchesFragment>(MatchesFragment::class.java)

}
