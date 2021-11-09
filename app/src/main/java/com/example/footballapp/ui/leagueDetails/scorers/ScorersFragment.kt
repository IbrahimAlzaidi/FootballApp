package com.example.footballapp.ui.leagueDetails.scorers

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentScorersBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class ScorersFragment(private val args: Int?): BaseFragment<FragmentScorersBinding, ScorersViewModel>
    (R.layout.fragment_scorers), OnClickListener{

    override fun setup() {
        binding.viewModel = viewModel
        val topScoreAdapter = ScorersAdapter(emptyList(),this)
        binding.topScorers.adapter = topScoreAdapter
    }

    override fun onClickItem(id: Int) {
        val action = LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToPlayerDetailsFragment(id)
        this.findNavController().navigate(action)
    }

    override fun getViewModel()= ScorersViewModel::class.java

    override val arg: Int?
        get() = args

    override val leagueId: Int?
        get() = null
}
