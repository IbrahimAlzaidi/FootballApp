package com.example.footballapp.ui.standing

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.StandingViewModel

class StandingFragment: BaseFragment<FragmentStandingBinding>(R.layout.fragment_standing){
    private val viewModel = StandingViewModel()
    override fun setup() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}