package com.example.footballapp.ui.clubDetails.clubMatch

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClubMatchPlayedBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.OnClickListener

class ClubMatchPlayedFragment: BaseFragment<FragmentClubMatchPlayedBinding, ClubMatchPlayedViewModel>
        (R.layout.fragment_club_match_played), OnClickListener {

    override fun onStart() {
        super.onStart()
        binding.viewModel = ClubMatchPlayedViewModel(arguments?.getInt(Constant.TEAM_ID_KEY))
        val currentTeamMatchAdapter = ClubMatchAdapter(emptyList(), this)
        binding.currentMatch.adapter = currentTeamMatchAdapter
    }
    override fun onClickItem(id: Int, teamId: Int, leagueId: Int) {
        navigate(ClubDetailsFragmentDirections.actionClubDetailsFragmentToMatchDetailsFragment(id))
    }
    override fun getViewModel() = ClubMatchPlayedViewModel::class.java

    companion object : InstantsFragments<ClubMatchPlayedFragment>(ClubMatchPlayedFragment::class.java)
}
