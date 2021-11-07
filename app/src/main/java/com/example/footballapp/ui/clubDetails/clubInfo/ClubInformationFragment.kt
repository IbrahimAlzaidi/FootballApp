package com.example.footballapp.ui.clubDetails.clubInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClupInformationBinding
import com.example.footballapp.ui.base.BaseFragment


class ClubInformationFragment(val teamId: Int?, val leagueID: Int?) :
    BaseFragment<FragmentClupInformationBinding, ClubInformationViewModel>(R.layout.fragment_clup_information) {
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel(): Class<ClubInformationViewModel> = ClubInformationViewModel::class.java

    override val arg: Int?
        get() = teamId
    override val leagueId: Int?
        get() = leagueID
}
