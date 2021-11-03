package com.example.footballapp.ui.playerDetails

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerDetailsBinding
import com.example.footballapp.ui.base.BaseFragment

class PlayerDetailsFragment: BaseFragment<FragmentPlayerDetailsBinding, PlayerDetailsViewModel>(R.layout.fragment_player_details){
    override fun setup() {
        binding.viewModel = viewModel
    }
    override fun getViewModel()= PlayerDetailsViewModel::class.java
    override val arg: Int?
        get() = null
}