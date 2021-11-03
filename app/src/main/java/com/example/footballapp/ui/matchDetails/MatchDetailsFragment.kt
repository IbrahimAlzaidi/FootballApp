package com.example.footballapp.ui.matchDetails

import androidx.navigation.fragment.navArgs
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchDetailsBinding
import com.example.footballapp.ui.base.BaseFragment

class MatchDetailsFragment: BaseFragment<FragmentMatchDetailsBinding, MatchDetailsViewModel>(R.layout.fragment_match_details){
    private val args: MatchDetailsFragmentArgs by navArgs()
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel()= MatchDetailsViewModel::class.java
    override val arg: Int
        get() = args.matchId
}