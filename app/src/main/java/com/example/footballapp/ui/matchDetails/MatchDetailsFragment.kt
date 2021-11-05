package com.example.footballapp.ui.matchDetails

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.matchDetails.matchLineups.MatchLineupsFragment
import com.example.footballapp.ui.matchDetails.matchStatistic.MatchStatisticFragment
import com.example.footballapp.util.FootballViewPager
import com.example.footballapp.util.ViewPagerTransitions
import com.google.android.material.tabs.TabLayoutMediator

class MatchDetailsFragment :
    BaseFragment<FragmentMatchDetailsBinding, MatchDetailsViewModel>(R.layout.fragment_match_details) {
    private val args: MatchDetailsFragmentArgs by navArgs()

    private val fragmentTitles = listOf("Statistic", "Lineups")
    private lateinit var fragmentsList: List<Fragment>
    private var matchId: Int? = null
    override fun setup() {
        binding.viewModel = viewModel
        matchId = args.matchId
        fragmentsList = listOf(
            MatchStatisticFragment(matchId),
            MatchLineupsFragment(matchId)
        )
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

    override fun getViewModel() = MatchDetailsViewModel::class.java
    override val arg: Int
        get() = args.matchId
}
