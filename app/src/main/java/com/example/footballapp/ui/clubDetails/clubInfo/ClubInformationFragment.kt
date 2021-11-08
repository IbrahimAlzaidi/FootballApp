package com.example.footballapp.ui.clubDetails.clubInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClupInformationBinding
import com.example.footballapp.ui.base.BaseFragment


class ClubInformationFragment(private val teamId: Int?, private val leagueID: Int?) :
    BaseFragment<FragmentClupInformationBinding, ClubInformationViewModel>(R.layout.fragment_clup_information) {
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel() = ClubInformationViewModel::class.java

    override val arg: Int?
        get() = teamId
    override val leagueId: Int?
        get() = leagueID
}
