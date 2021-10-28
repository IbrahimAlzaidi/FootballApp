package com.example.footballapp.ui.matches

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.MatchesViewModel

class MatchesFragment: BaseFragment<FragmentMatchesBinding>(R.layout.fragment_matches){
    override fun setup() {
        binding.viewModel = viewModel as MatchesViewModel?
    }

}