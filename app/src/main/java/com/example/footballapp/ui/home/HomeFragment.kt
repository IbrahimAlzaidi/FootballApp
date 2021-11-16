package com.example.footballapp.ui.home

import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.home.liveMatch.LiveMatchFragment
import com.example.footballapp.ui.home.matchScheduled.MatchScheduledFragment
import com.example.footballapp.util.Constant.LIVE
import com.example.footballapp.util.Constant.MATCH_SCHEDULED
import com.example.footballapp.util.OnClickListener

class HomeFragment :
    BaseViewPagerFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home),
    OnClickListener {

    override fun getViewModel() = HomeViewModel::class.java

    override val fragmentTitles = listOf(LIVE, MATCH_SCHEDULED)

    override fun onStart() {
        super.onStart()
        val fragmentsList = listOf(LiveMatchFragment(), MatchScheduledFragment())
        val viewPager = binding.homeViewPager
        val tabLayout = binding.homeTabLayoutFragments
        val leaguesAdapter = LeaguesAdapter(mutableListOf(), this)
        binding.recycleView.adapter = leaguesAdapter
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
        searchNavigation()
    }

    private fun searchNavigation() {
        binding.editText.setOnFocusChangeListener { _, isFocused ->
            if (isFocused) {
                val action = HomeFragmentDirections.actionHomeFragmentToSearchFragment()
                val extras = FragmentNavigatorExtras(
                    binding.editText to getString(R.string.searchTransition),
                    binding.clearTextImage to getString(R.string.closeTransition),
                )
                findNavController().navigate(action, extras)
            }
        }
    }

    override fun onClickItem(id: Int, teamId: Int, leagueId: Int) {
        navigate(HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(leagueId))
    }
}
