package com.example.footballapp.ui.clubDetails

import android.util.Log
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubDetailsBinding
import com.example.footballapp.ui.base.BaseViewPager
import com.example.footballapp.ui.clubDetails.clubInfo.ClubInformationFragment
import com.example.footballapp.ui.clubDetails.clubMatch.ClubMatchPlayedFragment
import com.example.footballapp.ui.clubDetails.squadInfo.SquadInfoFragment
import com.example.footballapp.util.Constant.TAG

class ClubDetailsFragment :
    BaseViewPager<FragmentClubDetailsBinding, ClubDetailsViewModel>(R.layout.fragment_club_details) {

    private val args: ClubDetailsFragmentArgs by navArgs()

    override val fragmentTitles = listOf("Team Information", "Squad Member", "Latest Match")

    override fun setup() {
        val leagueID = args.leagueId
        val teamID = args.teamId
        Log.i(TAG, "ClubDetailsFragment: ${args.leagueId} - ${args.teamId}")
        val viewPager = binding.detailsViewPager
        val tabLayout = binding.tabLayoutFragments
        val fragmentsList =
            listOf(
                ClubInformationFragment(teamID, leagueID),
                SquadInfoFragment(teamID,leagueID),
                ClubMatchPlayedFragment(teamID)
            )
        initViewPager(fragmentsList, viewPager)
        initTabLayout(viewPager, tabLayout)
    }

    override fun getViewModel() = ClubDetailsViewModel::class.java

    override val arg: Int
        get() = args.teamId

    override val leagueId: Int
        get() = args.leagueId
    override val teamId: Int?
        get() = null

}
