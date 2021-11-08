package com.example.footballapp.ui.home

import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.allMatchScheduled.AllMatchScheduledFragment
import com.example.footballapp.ui.home.liveMatch.LiveMatchFragment
import com.example.footballapp.util.OnClickListener


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home),
    OnClickListener {
    override fun getViewModel() = HomeViewModel::class.java

    private val fragmentTitles = listOf("Live", "Match Scheduled")

    override fun setup() {
        val fragmentsList = listOf(LiveMatchFragment(), AllMatchScheduledFragment())
        binding.viewModel = viewModel
        val viewPager = binding.homeViewPager
        val tabLayout = binding.homeTabLayoutFragments
        val leaguesAdapter = LeaguesAdapter(mutableListOf(), this)
        binding.recycleView.adapter = leaguesAdapter
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout, fragmentTitles)
        searchNavigation()
    }

    private fun searchNavigation() {
        binding.searchBar.setOnFocusChangeListener { _, isFocused ->
            if (isFocused) {
                val action = HomeFragmentDirections.actionHomeFragmentToSearchFragment()
                val extras = FragmentNavigatorExtras(
                    binding.searchBar to getString(R.string.searchTransition)
                )
                findNavController().navigate(action, extras)
            }
        }
    }

    override fun onClickItem(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(id)
        this.findNavController().navigate(action)
    }

    override val arg: Int?
        get() = null
    override val leagueId: Int?
        get() = null
}
