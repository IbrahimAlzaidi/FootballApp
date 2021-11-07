package com.example.footballapp.ui.leagueDetails

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.matches.MatchesFragment
import com.example.footballapp.ui.leagueDetails.scorers.ScorersFragment
import com.example.footballapp.ui.leagueDetails.standing.StandingFragment
import com.example.footballapp.util.FootballViewPager
import com.example.footballapp.util.ViewPagerTransitions
import com.google.android.material.tabs.TabLayoutMediator

class LeagueDetailsFragment : BaseFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>
    (R.layout.fragment_league_details){
    private val args: LeagueDetailsFragmentArgs by navArgs()
    private var leagueID: Int? = null
    private val fragmentTitles = listOf("Standings", "Top Score", "Matches")
    private lateinit var fragmentsList: List<Fragment>
    override fun getViewModel() = LeagueDetailsViewModel::class.java
    override fun setup() {
        leagueID = args.leagueId
        binding.viewModel = viewModel
        fragmentsList = listOf(
            StandingFragment(leagueID),
            ScorersFragment(leagueID),
            MatchesFragment(leagueID))
        initViewPager(fragmentsList)
        initTabLayout()
    }
    @SuppressLint("RestrictedApi")
    private fun initViewPager(fragmentsList: List<Fragment>) {
        val standingPagerAdapterView = FootballViewPager(this.requireActivity(), fragmentsList)
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

    override val leagueId: Int?
        get() = null
}
