package com.example.footballapp.ui.clubDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.clubDetails.clubInfo.ClubInformationFragment
import com.example.footballapp.ui.clubDetails.clubMatch.ClubMatchPlayedFragment
import com.example.footballapp.ui.clubDetails.squadInfo.SquadInfoFragment

class ClubDetailsFragment :
    BaseFragment<FragmentClubDetailsBinding, ClubDetailsViewModel>(R.layout.fragment_club_details) {

    private val args: ClubDetailsFragmentArgs by navArgs()

    private val fragmentTitles = listOf("Team Information", "Squad Member", "Latest Match")

    override fun setup() {
        val leagueID = args.leagueId
        val teamID = args.teamId
        binding.viewModel = viewModel
        val viewPager = binding.detailsViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList =
            listOf(
                ClubInformationFragment(teamID, leagueID),
                SquadInfoFragment(teamID),
                ClubMatchPlayedFragment(teamID)
            )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout, fragmentTitles)
    }

    override fun getViewModel() = ClubDetailsViewModel::class.java
    override val arg: Int
        get() = args.teamId

    override val leagueId: Int
        get() = args.leagueId
}
