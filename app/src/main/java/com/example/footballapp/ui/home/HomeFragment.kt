package com.example.footballapp.ui.home

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.allMatchScheduled.AllMatchScheduledFragment
import com.example.footballapp.ui.home.liveMatch.LiveMatchFragment
import com.example.footballapp.ui.leagueDetails.ViewPagerStandings
import com.example.footballapp.ui.leagueDetails.ViewPagerTransitions
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    R.layout.fragment_home
), LeagueInteractionListener {
    override fun getViewModel() = HomeViewModel::class.java

    private val fragmentTitles = listOf("Live", "Match Scheduled")
    private val fragmentsList = listOf(LiveMatchFragment(arg),AllMatchScheduledFragment(arg))

    override fun setup() {
        binding.viewModel = viewModel
        val leaguesAdapter = LeaguesAdapter(mutableListOf(), this)
        binding.recycleView.adapter = leaguesAdapter
        initViewPager()
        initTabLayout()
    }

    private fun initViewPager() {
        val standingPagerAdapterView = ViewPagerStandings(this.requireActivity(),
            fragmentsList as List<Fragment>
        )
        binding.homeViewPager.apply {
            adapter = standingPagerAdapterView
            setPageTransformer(ViewPagerTransitions())
        }

    }

    private fun initTabLayout() {
        TabLayoutMediator(
            binding.homeTabLayoutFragments,
            binding.homeViewPager
        ) { tap, positions ->
            tap.text = fragmentTitles[positions]
        }.attach()
    }

    override fun onLeagueSelected(leagueId: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(leagueId)
        this.findNavController().navigate(action)
    }

    override val arg: Int?
        get() = null
}
