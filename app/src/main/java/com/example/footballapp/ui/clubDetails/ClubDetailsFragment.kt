package com.example.footballapp.ui.clubDetails

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubDetailsBinding
import com.example.footballapp.ui.base.BaseFragment

class ClubDetailsFragment: BaseFragment<FragmentClubDetailsBinding, ClubDetailsViewModel>(
    R.layout.fragment_club_details){
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel() = ClubDetailsViewModel::class.java
    override val arg: Int?
        get() = null
}