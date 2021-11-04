package com.example.footballapp.ui.leagueDetails.matches

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class MatchesFragment(private val args: Int?) :
    BaseFragment<FragmentMatchesBinding, MatchesViewModel>(R.layout.fragment_matches), OnClickListener{
    override fun setup() {
        binding.viewModel = viewModel
        val matchScheduledAdapter = MatchAdapter(emptyList(), this)
        binding.matchScheduledRecycler.adapter = matchScheduledAdapter
    }

    override fun getViewModel() = MatchesViewModel::class.java
    override val arg: Int?
        get() = args

    override fun onClickItem(id: Int) {
        val action = LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToMatchDetailsFragment(id)
        this.findNavController().navigate(action)
    }
}
