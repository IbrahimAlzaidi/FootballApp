package com.example.footballapp.ui.playerDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.playerDetails.matchPlayedStatistic.PlayedStatisticFragment
import com.example.footballapp.ui.playerDetails.playedInfo.PlayerInformationFragment

class PlayerDetailsFragment :
    BaseFragment<FragmentPlayerDetailsBinding, PlayerDetailsViewModel>(R.layout.fragment_player_details) {
    private val args: PlayerDetailsFragmentArgs by navArgs()
    override fun setup() {
        val playerId = args.playerId
        binding.viewModel = viewModel
        val viewPager = binding.detailsViewPager
        val indicator = binding.indicator
        val fragmentsList =
            listOf(
                PlayerInformationFragment(playerId),
                PlayedStatisticFragment(playerId),
            )
        initViewPager(fragmentsList,viewPager = viewPager)
        indicator.setViewPager2(viewPager)
    }

    override fun getViewModel() = PlayerDetailsViewModel::class.java
    override val arg: Int
        get() = args.playerId

    override val leagueId: Int?
        get() = null
}
