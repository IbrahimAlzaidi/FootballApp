package com.example.footballapp.ui.matchDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.matchDetails.lineup.LineupFragment
import com.example.footballapp.ui.matchDetails.matchState.MatchStateFragment
import com.example.footballapp.ui.matchDetails.substitutes.SubstitutesFragment
import com.example.footballapp.util.Constant.LINEUPS
import com.example.footballapp.util.Constant.MATCH_ID_KEY
import com.example.footballapp.util.Constant.STATS
import com.example.footballapp.util.Constant.SUBSTITUTES

class MatchDetailsFragment :
    BaseViewPagerFragment<FragmentMatchDetailsBinding, MatchDetailsViewModel>(R.layout.fragment_match_details) {

    private val args: MatchDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf(STATS, LINEUPS, SUBSTITUTES)

    override fun onStart() {
        super.onStart()
        binding.viewModel = MatchDetailsViewModel(matchId = args.matchId)
        val matchID = args.matchId
        val viewPager = binding.detailsViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList =
            listOf(
                MatchStateFragment.newInstance(MATCH_ID_KEY to matchID),
                LineupFragment.newInstance(MATCH_ID_KEY to matchID),
                SubstitutesFragment.newInstance(MATCH_ID_KEY to matchID)
            )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
    }

    override fun getViewModel() = MatchDetailsViewModel::class.java
}
