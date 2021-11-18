package com.example.footballapp.ui.playerDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerDetailsBinding
import com.example.footballapp.ui.base.BaseViewPagerFragment

class PlayerDetailsFragment :
    BaseViewPagerFragment<FragmentPlayerDetailsBinding, PlayerDetailsViewModel>(R.layout.fragment_player_details) {

    private val args: PlayerDetailsFragmentArgs by navArgs()

    override fun onStart() {
        super.onStart()
        binding.viewModel = PlayerDetailsViewModel(
            playerId = args.playerId,
            teamId = args.teamId,
            leagueId = args.leagueId
        )
    }

    override fun getViewModel() = PlayerDetailsViewModel::class.java

    override val fragmentTitles: List<String?>
        get() = emptyList()
}
