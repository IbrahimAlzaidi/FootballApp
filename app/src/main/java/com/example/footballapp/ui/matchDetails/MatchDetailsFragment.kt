package com.example.footballapp.ui.matchDetails

import android.util.Log
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.matchDetails.lineup.LineupFragment
import com.example.footballapp.ui.matchDetails.matchState.MatchStateFragment
import com.example.footballapp.ui.matchDetails.substitutes.SubstitutesFragment
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.OnClickListener

class MatchDetailsFragment :
    BaseViewPagerFragment<FragmentMatchDetailsBinding, MatchDetailsViewModel>(R.layout.fragment_match_details){

    private val args: MatchDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf("STATS", "LINEUPS", "SUBSTITUTES")

    override fun setup() {
        val matchID = args.matchId
        val viewPager = binding.detailsViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList =
            listOf(
                MatchStateFragment.newInstance(matchID),
                LineupFragment.newInstance(matchID),
                SubstitutesFragment.newInstance(matchID)
            )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
    }

    override fun onStart() {
        super.onStart()
        binding.viewModel = MatchDetailsViewModel(matchId = args.matchId)
    }

    override fun getViewModel() = MatchDetailsViewModel::class.java

    override val arg: Int?
        get() = null
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null
}
