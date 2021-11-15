package com.example.footballapp.ui.leagueDetails.scorers

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentScorersBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.OnClickListener

class ScorersFragment(): BaseFragment<FragmentScorersBinding, ScorersViewModel>
    (R.layout.fragment_scorers), OnClickListener{



    override fun setup() {
        val topScoreAdapter = ScorersAdapter(emptyList(),this)
        binding.topScoreRecycler.adapter = topScoreAdapter

    }
    override fun onStart() {
        super.onStart()
        binding.viewModel = ScorersViewModel(arguments?.getInt(Constant.LEAGUE_ID_KEY))
    }

    override fun getViewModel()= ScorersViewModel::class.java

    override fun onClickItem(id: Int, teamId: Int?, leagueId: Int?) {
        navigate(LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToPlayerDetailsFragment(id,teamId!!,
            arguments?.getInt(Constant.LEAGUE_ID_KEY)!!
        )
        )
    }

    companion object : InstantsFragments<ScorersFragment>(ScorersFragment::class.java)
}
