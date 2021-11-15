package com.example.footballapp.ui.leagueDetails.scorers

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentScorersBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.OnClickListener

class ScorersFragment: BaseFragment<FragmentScorersBinding, ScorersViewModel>
    (R.layout.fragment_scorers), OnClickListener{

    override fun onStart() {
        super.onStart()
        binding.viewModel = ScorersViewModel(arguments?.getInt(Constant.LEAGUE_ID_KEY))
        val topScoreAdapter = ScorersAdapter(emptyList(),this)
        binding.topScoreRecycler.adapter = topScoreAdapter
    }

    override fun getViewModel()= ScorersViewModel::class.java

    override fun onClickItem(id: Int, teamId: Int, leagueId: Int) {
        arguments?.getInt(Constant.LEAGUE_ID_KEY)?.let {
            LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToPlayerDetailsFragment(
                id,
                teamId,
                it
            )
        }?.let {
            navigate(it
            )
        }
    }
    companion object : InstantsFragments<ScorersFragment>(ScorersFragment::class.java)
}
