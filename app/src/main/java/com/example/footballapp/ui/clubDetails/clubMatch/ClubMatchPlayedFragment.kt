package com.example.footballapp.ui.clubDetails.clubMatch

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubMatchPlayedBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener


class ClubMatchPlayedFragment(private val teamID: Int?) :
    BaseFragment<FragmentClubMatchPlayedBinding, ClubMatchPlayedViewModel>(R.layout.fragment_club_match_played),
    OnClickListener {
    override fun setup() {
        binding.viewModel = viewModel
        val currentTeamMatchAdapter = ClubMatchAdapter(emptyList(), this)
        binding.currentMatch.adapter = currentTeamMatchAdapter
    }

    override fun getViewModel() = ClubMatchPlayedViewModel::class.java

    override val arg: Int?
        get() = teamID
    override val leagueId: Int?
        get() = null

    override fun onClickItem(id: Int) {
        val action =
            ClubDetailsFragmentDirections.actionClubDetailsFragmentToMatchDetailsFragment(id)
        this.findNavController().navigate(action)
    }
}
