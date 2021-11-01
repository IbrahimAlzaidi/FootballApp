package com.example.footballapp.ui.matchDetails

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.MatchDetailsViewModel

class MatchDetailsFragment: BaseFragment<FragmentMatchDetailsBinding, MatchDetailsViewModel>(R.layout.fragment_match_details){
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel()= MatchDetailsViewModel::class.java
}