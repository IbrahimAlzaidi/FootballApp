package com.example.footballapp.ui.leagueDetails.standing

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.OnClickListener

class StandingFragment :
    BaseFragment<FragmentStandingBinding, StandingViewModel>(R.layout.fragment_standing),
    OnClickListener {

    override fun onStart() {
        super.onStart()
        binding.viewModel = StandingViewModel(arguments?.getInt(Constant.LEAGUE_ID_KEY))
        val standingAdapter = StandingAdapter(emptyList(), this)
        binding.leagueRecycler.adapter = standingAdapter
    }

    override fun getViewModel() = StandingViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int, leagueId: Int) {
        arguments?.getInt(Constant.LEAGUE_ID_KEY)?.let {
            LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToClubDetailsFragment(
                teamId = teamId,
                leagueId = it
            )
        }?.let {
            navigate(
                it
            )
        }
    }
    companion object : InstantsFragments<StandingFragment>(StandingFragment::class.java)
}
