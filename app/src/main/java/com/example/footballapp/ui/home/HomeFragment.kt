package com.example.footballapp.ui.home

import android.util.Log
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentHomeBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant
import com.example.footballapp.viewModel.HomeViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) , LeaguesInteractionListener {
    private val viewModel = HomeViewModel()
    override fun setup() {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        val leaguesAdapter = LeaguesAdapter(emptyList(),this)
        val matchAdapter = MatchAdapter(emptyList(), null)
        binding.recycleView.adapter = leaguesAdapter
        binding.matchRecycler.adapter = matchAdapter
    }

    override fun onLeagueSelected(seasonId: Int, leagueId: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(seasonId,leagueId)
        this.findNavController().navigate(action)
        Log.i(Constant.TAG, "onLeagueSelected: $seasonId - $leagueId")
    }

//    fun View.goToAnotherFragment(navDirector: NavDirections) {
//        Navigation.findNavController(this).navigate(navDirector)
//    }
}
