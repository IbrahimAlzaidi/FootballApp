package com.example.footballapp.ui.leagueDetails

import android.annotation.SuppressLint
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.matches.MatchesFragment
import com.example.footballapp.ui.leagueDetails.scorers.ScorersFragment
import com.example.footballapp.ui.leagueDetails.standing.StandingFragment
import com.google.android.material.tabs.TabLayoutMediator

class LeagueDetailsFragment : BaseFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>
    (R.layout.fragment_league_details), ArgumentInteraction {
    private val fragmentTitles = listOf("Standings", "Top Score", "Matches")
    private val fragmentsList = listOf(
        StandingFragment(this),
        ScorersFragment(this),
        MatchesFragment(this))
    private val args: LeagueDetailsFragmentArgs by navArgs()
    override fun getViewModel() = LeagueDetailsViewModel::class.java
    override fun setup() {
        binding.viewModel = viewModel
        initViewPager()
        initTabLayout()
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

    override val arg: Int
        get() = args.leagueId

    override fun getLeagueId() = args.leagueId
}
