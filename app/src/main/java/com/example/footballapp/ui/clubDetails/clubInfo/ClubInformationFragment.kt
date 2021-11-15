package com.example.footballapp.ui.clubDetails.clubInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClupInformationBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.util.Constant

class ClubInformationFragment :
    BaseFragment<FragmentClupInformationBinding, ClubInformationViewModel>(R.layout.fragment_clup_information) {

    override fun onStart() {
        super.onStart()
        binding.viewModel = ClubInformationViewModel(
            arguments?.getInt(Constant.TEAM_ID_KEY),
            arguments?.getInt(Constant.LEAGUE_ID_KEY)
        )
    }
    override fun getViewModel() = ClubInformationViewModel::class.java
    companion object : InstantsFragments<ClubInformationFragment>(ClubInformationFragment::class.java)
}
