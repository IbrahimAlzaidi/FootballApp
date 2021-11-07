package com.example.footballapp.ui.clubDetails.clupInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClupInformationBinding
import com.example.footballapp.ui.base.BaseFragment


class ClubInformationFragment(val args: Int?, val teamId: Int?) :
    BaseFragment<FragmentClupInformationBinding, ClubInformationViewModel>(R.layout.fragment_clup_information) {
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel(): Class<ClubInformationViewModel> = ClubInformationViewModel::class.java

    override val arg: Int?
        get() = args
    override val leagueId: Int?
        get() = teamId
}
