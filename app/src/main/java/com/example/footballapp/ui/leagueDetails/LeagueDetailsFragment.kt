package com.example.footballapp.ui.leagueDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.leagueDetails.matches.MatchesFragment
import com.example.footballapp.ui.leagueDetails.scorers.ScorersFragment
import com.example.footballapp.ui.leagueDetails.standing.StandingFragment

class LeagueDetailsFragment :
    BaseFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>(R.layout.fragment_league_details) {

    private val args: LeagueDetailsFragmentArgs by navArgs()

    private val fragmentTitles = listOf("Standings", "Top Score", "Matches")

    override fun setup() {
        val leagueID = args.leagueId
        val viewPager = binding.myViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList = listOf(
            StandingFragment(leagueID),
            ScorersFragment(leagueID),
            MatchesFragment(leagueID)
        )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout, fragmentTitles)
    }

    override fun getViewModel() = LeagueDetailsViewModel::class.java

    override val arg: Int
        get() = args.leagueId

    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
