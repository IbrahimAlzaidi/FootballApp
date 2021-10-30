package com.example.footballapp.ui.home

import androidx.navigation.Navigation
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.HomeViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home){
    private val viewModel = HomeViewModel()
    override fun setup() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        val leaguesAdapter = LeaguesAdapter(mutableListOf(),null)
        val matchAdapter = MatchAdapter(mutableListOf(),null)
        binding.leagueRecycleView.adapter = leaguesAdapter
        binding.matchRecycler.adapter = matchAdapter
        binding.button.setOnClickListener {v ->
            Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_leagueDetailsFragment)
        }
    }
}
