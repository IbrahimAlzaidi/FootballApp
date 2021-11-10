package com.example.footballapp.ui.leagueDetails.standing

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class StandingFragment(private val args: Int?) :
    BaseFragment<FragmentStandingBinding, StandingViewModel>(R.layout.fragment_standing){

    override fun setup() {
        binding.viewModel = viewModel
        val standingAdapter = StandingAdapter(emptyList(), viewModel)
        binding.leagueRecycler.adapter = standingAdapter
    }

    override fun getViewModel() = StandingViewModel::class.java
    override val arg: Int?
        get() = args
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
