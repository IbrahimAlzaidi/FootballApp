package com.example.footballapp.ui.home

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.allMatchScheduled.AllMatchScheduledFragment
import com.example.footballapp.ui.home.liveMatch.LiveMatchFragment
import com.example.footballapp.util.FootballViewPager
import com.example.footballapp.util.OnClickListener
import com.example.footballapp.util.ViewPagerTransitions
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home),
    OnClickListener {
    override fun getViewModel() = HomeViewModel::class.java

    private val fragmentTitles = listOf("Live", "Match Scheduled")
    private val fragmentsList: List<Fragment> =
        listOf(LiveMatchFragment(null), AllMatchScheduledFragment(null))

    override fun setup() {
        binding.viewModel = viewModel
        val leaguesAdapter = LeaguesAdapter(mutableListOf(), this)
        binding.recycleView.adapter = leaguesAdapter
        initViewPager()
        initTabLayout()
        binding.homeViewPager.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(39)
            this.findNavController().navigate(action)
        }
    }

    private fun initViewPager() {
        val standingPagerAdapterView =
            FootballViewPager(this.requireActivity(), fragmentsList)
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

    override fun onClickItem(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(id)
        this.findNavController().navigate(action)
    }

    override val arg: Int?
        get() = null
}
