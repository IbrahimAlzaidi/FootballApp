package com.example.footballapp.ui.clubDetails

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.ClubDetailsViewModel

class ClubDetailsFragment: BaseFragment<FragmentClubDetailsBinding>(R.layout.fragment_club_details){
    private val viewModel = ClubDetailsViewModel()
    override fun setup() {
        binding.viewModel = viewModel
    }

}