package com.example.footballapp.ui.leagueDetails

import android.util.Log
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.viewModel.LeagueDetailsViewModel


class LeagueDetailsFragment : BaseFragment<FragmentLeagueDetailsBinding>(R.layout.fragment_league_details) {
    private val args : LeagueDetailsFragmentArgs by navArgs()
    override fun setup() {
        val viewModel = LeagueDetailsViewModel(seasonId = args.seasonId,leaguesId = args.leaguesId)
        Log.i(TAG, "LeagueDetailsFragment: ${args.seasonId} - ${args.leaguesId}")
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        val leaguesStanding = LeaguesStandingAdapter(emptyList(),null)
        binding.leaguesStandingRecycler.adapter = leaguesStanding
    }
}
