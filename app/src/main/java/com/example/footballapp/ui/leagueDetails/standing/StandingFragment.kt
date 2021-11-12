package com.example.footballapp.ui.leagueDetails.standing

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class StandingFragment(private val args: Int?) :
    BaseFragment<FragmentStandingBinding, StandingViewModel>(R.layout.fragment_standing), OnClickListener{

    override fun setup() {
        val standingAdapter = StandingAdapter(emptyList(), this)
        binding.leagueRecycler.adapter = standingAdapter
    }

    override fun getViewModel() = StandingViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int?) {
        arg?.let {
            LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToClubDetailsFragment(id,
                it
            )
        }?.let { navigate(it) }
    }

    override val arg: Int?
        get() = args
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null
}
