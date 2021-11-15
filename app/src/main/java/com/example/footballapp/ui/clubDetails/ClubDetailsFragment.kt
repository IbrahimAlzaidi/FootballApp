package com.example.footballapp.ui.clubDetails

import android.os.Bundle
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.clubDetails.clubInfo.ClubInformationFragment
import com.example.footballapp.ui.clubDetails.clubMatch.ClubMatchPlayedFragment
import com.example.footballapp.ui.clubDetails.squadInfo.SquadInfoFragment
import com.example.footballapp.util.Constant.LEAGUE_ID_KEY
import com.example.footballapp.util.Constant.TEAM_ID_KEY

class ClubDetailsFragment :
    BaseViewPagerFragment<FragmentClubDetailsBinding, ClubDetailsViewModel>(R.layout.fragment_club_details) {

    private val args: ClubDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf("Team Information", "Squad Member", "Latest Match")

    override fun setup() {
        val leagueID = args.leagueId
        val teamID = args.teamId
        val viewPager = binding.detailsViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList =
            listOf(
                ClubInformationFragment.newInstance(teamId = teamID, leagueId = leagueID),
                SquadInfoFragment.newInstance(teamId = teamID, leagueId = leagueID),
                ClubMatchPlayedFragment.newInstance(teamId = teamID)
            )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
    }

    override fun onStart() {
        super.onStart()
        binding.viewModel =
            ClubDetailsViewModel(arguments?.getInt(TEAM_ID_KEY), arguments?.getInt(LEAGUE_ID_KEY))
    }

    override fun getViewModel() = ClubDetailsViewModel::class.java


    companion object {
        fun newInstance(teamId: Int?, leagueId: Int?): ClubDetailsFragment =
            ClubDetailsFragment().apply {
                arguments = Bundle().apply {
                    if (teamId != null) {
                        putInt(TEAM_ID_KEY, teamId)
                    }
                    if (leagueId != null) {
                        putInt(LEAGUE_ID_KEY, leagueId)
                    }
                }
            }
    }
}
