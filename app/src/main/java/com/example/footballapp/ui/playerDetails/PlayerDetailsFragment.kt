package com.example.footballapp.ui.playerDetails

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerDetailsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.PlayerDetailsViewModel

class PlayerDetailsFragment: BaseFragment<FragmentPlayerDetailsBinding>(R.layout.fragment_player_details){
    private val viewModel = PlayerDetailsViewModel()
    override fun setup() {
        binding.viewModel = viewModel
    }

}