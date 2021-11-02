package com.example.footballapp.ui.leagueDetails

import android.annotation.SuppressLint
import android.util.Log
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.matchDay.MatchDayFragment
import com.example.footballapp.ui.scorers.ScorersFragment
import com.example.footballapp.ui.standing.StandingFragment
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.viewModel.LeagueDetailsViewModel
import com.google.android.material.tabs.TabLayoutMediator


class LeagueDetailsFragment : BaseFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>
    (R.layout.fragment_league_details) {
    private val fragmentTitles = listOf("Standings", "Top Score", "Match Day")
    private val fragmentsList = listOf(StandingFragment(), ScorersFragment(), MatchDayFragment())
    private val args: LeagueDetailsFragmentArgs by navArgs()
    override fun getViewModel() = LeagueDetailsViewModel::class.java
    override fun setup() {
        initViewPager()
        initTabLayout()
        binding.viewModel = viewModel
        Log.i(TAG, args.leagueId.toString())
    }
    @SuppressLint("RestrictedApi")
    private fun initViewPager() {
        val standingPagerAdapterView = ViewPagerStandings(this.requireActivity(), fragmentsList)
        binding.myViewPager.apply {
            adapter = standingPagerAdapterView
            setPageTransformer(ViewPagerTransitions())
        }

    }

    private fun initTabLayout() {
        TabLayoutMediator(
            binding.tabLayoutFragments,
            binding.myViewPager
        ) { tap, positions ->
            tap.text = fragmentTitles[positions]
        }.attach()
    }
}
