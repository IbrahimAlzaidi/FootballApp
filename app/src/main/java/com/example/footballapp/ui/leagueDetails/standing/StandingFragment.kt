package com.example.footballapp.ui.leagueDetails.standing

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.FragmentFactory
import com.example.footballapp.util.OnClickListener

class StandingFragment(private val leagueID: Int?) :
    BaseFragment<FragmentStandingBinding, StandingViewModel>(R.layout.fragment_standing), OnClickListener{

    override fun setup() {
        childFragmentManager.fragmentFactory = FragmentFactory(leagueID,null,null)
        val standingAdapter = StandingAdapter(emptyList(), this)
        binding.leagueRecycler.adapter = standingAdapter
    }

    override fun getViewModel() = StandingViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int?) {
        leagueID?.let {
            LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToClubDetailsFragment(id,
                it
            )
        }?.let { navigate(it) }
    }

    override val arg: Int?
        get() = null
    override val leagueId: Int?
        get() = leagueID
    override val teamId: Int?
        get() = null
}
