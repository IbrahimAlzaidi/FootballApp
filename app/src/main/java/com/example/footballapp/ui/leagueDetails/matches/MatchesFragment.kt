package com.example.footballapp.ui.leagueDetails.matches

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchesBinding
import com.example.footballapp.ui.base.BaseFragment

class MatchesFragment: BaseFragment<FragmentMatchesBinding, MatchesViewModel>(R.layout.fragment_matches){
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel()= MatchesViewModel::class.java
}