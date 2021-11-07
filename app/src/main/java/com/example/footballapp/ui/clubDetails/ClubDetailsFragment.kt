package com.example.footballapp.ui.clubDetails

import android.annotation.SuppressLint
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.clubDetails.clubMatch.ClubMatchPlayedFragment
import com.example.footballapp.ui.clubDetails.clupInfo.ClubInformationFragment
import com.example.footballapp.ui.clubDetails.squadInfo.SquadInfoFragment
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.FootballViewPager
import com.example.footballapp.util.ViewPagerTransitions
import com.google.android.material.tabs.TabLayoutMediator

class ClubDetailsFragment :
    BaseFragment<FragmentClubDetailsBinding, ClubDetailsViewModel>(R.layout.fragment_club_details) {

    private val args: ClubDetailsFragmentArgs by navArgs()

    private lateinit var fragmentsList: List<Fragment>
    private val fragmentTitles = listOf("Team Information", "Squad Member", "Latest Match")
    private var leagueID: Int? = null
    private var teamID: Int? = null
    override fun setup() {
        Log.i(TAG, "ClubDetailsFragmentSetup: ${args.leagueId} - ${args.teamId}")
        leagueID = args.leagueId
        teamID = args.teamId
        binding.viewModel = viewModel
        fragmentsList =
            listOf(
                ClubInformationFragment(leagueID,teamID),
                SquadInfoFragment(teamID),
                ClubMatchPlayedFragment(teamID)
            )
        initViewPager(fragmentsList)
        initTabLayout()
    }

    @SuppressLint("RestrictedApi")
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

    override fun getViewModel() = ClubDetailsViewModel::class.java
    override val arg: Int
        get() = args.teamId

    override val leagueId: Int
        get() = args.leagueId
}
