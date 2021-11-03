package com.example.footballapp.ui.matches

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.MatchesViewModel

class MatchesFragment: BaseFragment<FragmentMatchesBinding, MatchesViewModel>(R.layout.fragment_matches){
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel()= MatchesViewModel::class.java
    override val arg: String?
        get() = null
}