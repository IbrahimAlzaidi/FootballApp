package com.example.footballapp.ui.leagueDetails

import android.util.Log
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.leagueDetails.matches.MatchesFragment
import com.example.footballapp.ui.leagueDetails.scorers.ScorersFragment
import com.example.footballapp.ui.leagueDetails.standing.StandingFragment
import com.example.footballapp.util.Constant.TAG

class LeagueDetailsFragment :
    BaseViewPagerFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>(R.layout.fragment_league_details) {

    private val args: LeagueDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf("Standings", "Top Score", "Matches")

    override fun setup() {
        val leagueID = args.leagueId
        Log.i(TAG, "LeagueDetailsFragmentSetup: $leagueID")
        val viewPager = binding.myViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList = listOf(
            StandingFragment(leagueID),
            ScorersFragment(leagueID),
            MatchesFragment(leagueID)
        )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
    }

    override fun getViewModel() = LeagueDetailsViewModel::class.java

    override val arg: Int
        get() = args.leagueId
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null
}
