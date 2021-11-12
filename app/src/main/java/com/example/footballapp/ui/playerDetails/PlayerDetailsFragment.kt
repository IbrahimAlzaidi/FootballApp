package com.example.footballapp.ui.playerDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerDetailsBinding
import com.example.footballapp.ui.base.BaseViewPager
import com.example.footballapp.ui.playerDetails.matchPlayedStatistic.PlayedStatisticFragment
import com.example.footballapp.ui.playerDetails.playedInfo.PlayerInformationFragment

class PlayerDetailsFragment :
    BaseViewPager<FragmentPlayerDetailsBinding, PlayerDetailsViewModel>(R.layout.fragment_player_details) {
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
                PlayedStatisticFragment(playerId,teamId,leagueId),
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
