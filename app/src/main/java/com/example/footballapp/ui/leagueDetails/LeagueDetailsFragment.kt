package com.example.footballapp.ui.leagueDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.leagueDetails.matches.MatchesFragment
import com.example.footballapp.ui.leagueDetails.scorers.ScorersFragment
import com.example.footballapp.ui.leagueDetails.standing.StandingFragment
import com.example.footballapp.util.Constant.LEAGUE_ID_KEY

class LeagueDetailsFragment :
    BaseViewPagerFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>(R.layout.fragment_league_details) {

    private val args: LeagueDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf("Standings", "Top Score", "Matches")

    override fun setup() {
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

    override fun onStart() {
        super.onStart()
        binding.viewModel = LeagueDetailsViewModel(args.leagueId)
    }

    override fun getViewModel() = LeagueDetailsViewModel::class.java

    override val arg: Int?
        get() = null
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null
}
