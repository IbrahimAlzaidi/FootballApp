package com.example.footballapp.ui.leagueDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.leagueDetails.matches.MatchesFragment
import com.example.footballapp.ui.leagueDetails.scorers.ScorersFragment
import com.example.footballapp.ui.leagueDetails.standing.StandingFragment
import com.example.footballapp.util.Constant.LEAGUE_ID_KEY
import com.example.footballapp.util.Constant.MATCHES
import com.example.footballapp.util.Constant.STANDINGS
import com.example.footballapp.util.Constant.TOP_SCORE

class LeagueDetailsFragment :
    BaseViewPagerFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>(R.layout.fragment_league_details) {

    private val args: LeagueDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf(STANDINGS, TOP_SCORE, MATCHES)

    override fun onStart() {
        super.onStart()
        binding.viewModel = LeagueDetailsViewModel(args.leagueId)
        val leagueID = args.leagueId
        val viewPager = binding.myViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList = listOf(
            StandingFragment.newInstance(LEAGUE_ID_KEY to leagueID),
            ScorersFragment.newInstance(LEAGUE_ID_KEY to leagueID),
            MatchesFragment.newInstance(LEAGUE_ID_KEY to leagueID)
        )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
    }

    override fun getViewModel() = LeagueDetailsViewModel::class.java
}
