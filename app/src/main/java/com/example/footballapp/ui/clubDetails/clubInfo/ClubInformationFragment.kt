package com.example.footballapp.ui.clubDetails.clubInfo

import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClupInformationBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant


class ClubInformationFragment(private val teamID: Int?, private val leagueID: Int?) :
    BaseFragment<FragmentClupInformationBinding, ClubInformationViewModel>(R.layout.fragment_clup_information) {
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel() = ClubInformationViewModel::class.java

    override val arg: Int?
        get() = teamID
    override val leagueId: Int?
        get() = leagueID
    override val teamId: Int?
        get() = null

}
