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
                PlayerInformationFragment.newInstance(
                    playerId = playerId,
                    teamId = teamId,
                    leagueId = leagueId,
                ),
                PlayedStatisticFragment.newInstance(playerId = playerId, leagueId = leagueId),
            )
        initViewPager(fragmentsList = fragmentsList, viewPager = viewPager)
        indicator.setViewPager2(viewPager)
    }

    override fun onStart() {
        super.onStart()
        binding.viewModel = PlayerDetailsViewModel(
            playerId = args.playerId,
            teamId = args.teamId,
            leagueId = args.leagueId
        )
        Log.i(TAG, "PlayerDetailsFragment______________onStart: ${args.playerId} ${args.teamId} ${args.leagueId}")
    }

    override fun getViewModel() = PlayerDetailsViewModel::class.java
    override val arg: Int?
        get() = null

    override val leagueId: Int?
        get() = null

    override val teamId: Int?
        get() = null

    override val fragmentTitles: List<String?>
        get() = emptyList()

}
