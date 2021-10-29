package com.example.footballapp.ui.scorers

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentScorersBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.ScorersViewModel

class ScorersFragment: BaseFragment<FragmentScorersBinding>(R.layout.fragment_scorers){
    private val viewModel = ScorersViewModel()
    override fun setup() {
        binding.viewModel = viewModel
    }

}