package com.example.footballapp.ui.matchDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchDetailsBinding
import com.example.footballapp.ui.base.BaseViewPager
import com.example.footballapp.ui.matchDetails.lineup.LineupFragment
import com.example.footballapp.ui.matchDetails.matchState.MatchStateFragment
import com.example.footballapp.ui.matchDetails.substitutes.SubstitutesFragment

class MatchDetailsFragment :
    BaseViewPager<FragmentMatchDetailsBinding, MatchDetailsViewModel>(R.layout.fragment_match_details) {

    private val args: MatchDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf("STATS", "LINEUPS", "SUBSTITUTES")

    override fun setup() {
        val matchID = args.matchId
        val viewPager = binding.detailsViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList =
            listOf(
                MatchStateFragment(matchID),
                LineupFragment(matchID),
                SubstitutesFragment(matchID)
            )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
    }

    override fun getViewModel() = MatchDetailsViewModel::class.java

    override val arg: Int
        get() = args.matchId

    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null
}
