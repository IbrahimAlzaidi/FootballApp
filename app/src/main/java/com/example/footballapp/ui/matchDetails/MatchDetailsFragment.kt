package com.example.footballapp.ui.matchDetails

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.matchDetails.lineup.LineupFragment
import com.example.footballapp.ui.matchDetails.matchState.MatchStateFragment
import com.example.footballapp.ui.matchDetails.substitutes.SubstitutesFragment
import com.example.footballapp.util.FootballViewPager
import com.example.footballapp.util.ViewPagerTransitions
import com.google.android.material.tabs.TabLayoutMediator

class MatchDetailsFragment :
    BaseFragment<FragmentMatchDetailsBinding, MatchDetailsViewModel>(R.layout.fragment_match_details) {
    private val args: MatchDetailsFragmentArgs by navArgs()

    private lateinit var fragmentsList: List<Fragment>
    private val fragmentTitles = listOf("STATS", "LINEUPS", "SUBSTITUTES")
    private var matchID: Int? = null

    override fun setup() {
        matchID = args.matchId
        binding.viewModel = viewModel
        fragmentsList =
            listOf(
                MatchStateFragment(matchID),
                LineupFragment(matchID),
                SubstitutesFragment(matchID)
            )
        initViewPager(fragmentsList)
        initTabLayout()
    }

    override fun getViewModel() = MatchDetailsViewModel::class.java

    private fun initViewPager(fragmentsList: List<Fragment>) {
        val standingPagerAdapterView = FootballViewPager(this.requireActivity(), fragmentsList)
        binding.detailsViewPager.apply {
            adapter = standingPagerAdapterView
            setPageTransformer(ViewPagerTransitions())
        }
    }

    private fun initTabLayout() {
        TabLayoutMediator(
            binding.tabLayoutFragments,
            binding.detailsViewPager
        ) { tap, positions ->
            tap.text = fragmentTitles[positions]
        }.attach()
    }


    override val arg: Int
        get() = args.matchId
    override val leagueId: Int?
        get() = null
}
