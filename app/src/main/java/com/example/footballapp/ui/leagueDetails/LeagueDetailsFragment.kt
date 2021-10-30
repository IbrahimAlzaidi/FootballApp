package com.example.footballapp.ui.leagueDetails

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.matches.MatchesFragment
import com.example.footballapp.ui.scorers.ScorersFragment
import com.example.footballapp.ui.standing.StandingFragment
import com.example.footballapp.viewModel.LeagueDetailsViewModel
import com.google.android.material.tabs.TabLayoutMediator


class LeagueDetailsFragment :
    BaseFragment<FragmentLeagueDetailsBinding>(R.layout.fragment_league_details) {
    private val viewModel = LeagueDetailsViewModel()

    private val fragmentList = listOf(StandingFragment(), ScorersFragment(), MatchesFragment())
    private val tabTitles = listOf(
        getString(R.string.Standing),
        getString(R.string.Scorers),
        getString(R.string.Matches),
    )

    override fun setup() {
        val pagerAdapter = MyPagerAdapter(this, fragmentList)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        binding.viewPager.adapter = pagerAdapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
}
