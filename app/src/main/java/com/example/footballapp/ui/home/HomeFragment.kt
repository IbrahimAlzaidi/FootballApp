package com.example.footballapp.ui.home

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.viewModel.HomeViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home), LeagueInteractionListener, MatchInteractionListener{
    override fun getViewModel()= HomeViewModel::class.java
    override fun setup() {
        binding.viewModel = viewModel
        val leaguesAdapter = LeaguesAdapter(mutableListOf(),this)
        val matchAdapter = MatchAdapter(mutableListOf(),this)
        binding.recycleView.adapter = leaguesAdapter
        binding.matchRecycler.adapter = matchAdapter
    }

    override fun onLeagueSelected(leagueId: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(leagueId)
        this.findNavController().navigate(action)
    }

    override fun onMatchSelected(matchId: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToMatchDetailsFragment(matchId)
        this.findNavController().navigate(action)
    }
}
