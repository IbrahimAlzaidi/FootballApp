package com.example.footballapp.ui.leagueDetails

import android.util.Log
import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLeagueDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.viewModel.LeagueDetailsViewModel


class LeagueDetailsFragment : BaseFragment<FragmentLeagueDetailsBinding, LeagueDetailsViewModel>
    (R.layout.fragment_league_details) {
    private val args: LeagueDetailsFragmentArgs by navArgs()
    override fun getViewModel()= LeagueDetailsViewModel::class.java
    override fun setup() {
        binding.viewModel = viewModel
        Log.i(TAG,args.leagueId.toString())

    }
}