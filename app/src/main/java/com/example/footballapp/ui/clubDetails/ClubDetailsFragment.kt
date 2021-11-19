package com.example.footballapp.ui.clubDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.clubDetails.clubInfo.ClubInformationFragment
import com.example.footballapp.ui.clubDetails.clubMatch.ClubMatchPlayedFragment
import com.example.footballapp.util.Constant.LATEST_MATCH
import com.example.footballapp.util.Constant.LEAGUE_ID_KEY
import com.example.footballapp.util.Constant.TEAM_ID_KEY
import com.example.footballapp.util.Constant.TEAM_INFORMATION

class ClubDetailsFragment :
    BaseViewPagerFragment<FragmentClubDetailsBinding, ClubDetailsViewModel>(R.layout.fragment_club_details) {

    private val args: ClubDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf(TEAM_INFORMATION,LATEST_MATCH)

    override fun onStart() {
        super.onStart()
        binding.viewModel = ClubDetailsViewModel(
            arguments?.getInt(TEAM_ID_KEY),
            arguments?.getInt(LEAGUE_ID_KEY)
        )
        val leagueID = args.leagueId
        val teamID = args.teamId
        val viewPager = binding.detailsViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList =
            listOf(
                ClubInformationFragment.newInstance(TEAM_ID_KEY to teamID, LEAGUE_ID_KEY to leagueID),
                ClubMatchPlayedFragment.newInstance(TEAM_ID_KEY to teamID)
            )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
    }

    override fun getViewModel() = ClubDetailsViewModel::class.java
}
