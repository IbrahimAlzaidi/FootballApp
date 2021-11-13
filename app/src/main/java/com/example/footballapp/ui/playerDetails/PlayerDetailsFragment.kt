package com.example.footballapp.ui.playerDetails

import android.util.Log
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment
import com.example.footballapp.ui.playerDetails.matchPlayedStatistic.PlayedStatisticFragment
import com.example.footballapp.ui.playerDetails.playedInfo.PlayerInformationFragment
import com.example.footballapp.util.Constant.TAG

class PlayerDetailsFragment :
    BaseViewPagerFragment<FragmentPlayerDetailsBinding, PlayerDetailsViewModel>(R.layout.fragment_player_details) {
    private val args: PlayerDetailsFragmentArgs by navArgs()
    override fun setup() {
        val playerId = args.playerId
        val teamId = args.teamId
        val leagueId = args.leagueId
        val viewPager = binding.detailsViewPager
        val indicator = binding.indicator

        val fragmentsList =
            listOf(
                PlayerInformationFragment(playerId,teamId,leagueId),
                PlayedStatisticFragment(playerId,leagueId),
            )
        initViewPager(fragmentsList,viewPager = viewPager)
        indicator.setViewPager2(viewPager)
    }

    override fun getViewModel() = PlayerDetailsViewModel::class.java
    override val arg: Int
        get() = args.playerId

    override val leagueId: Int
        get() = args.leagueId

    override val teamId: Int
        get() = args.teamId
    override val fragmentTitles: List<String?>
        get() = emptyList()
}
