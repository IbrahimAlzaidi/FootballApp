package com.example.footballapp.ui.matchDay

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchDayBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.MatchDayViewModel

class MatchDayFragment: BaseFragment<FragmentMatchDayBinding, MatchDayViewModel>(R.layout.fragment_match_day){
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel()= MatchDayViewModel::class.java
}