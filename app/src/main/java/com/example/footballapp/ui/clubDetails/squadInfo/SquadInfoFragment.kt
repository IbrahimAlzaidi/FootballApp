package com.example.footballapp.ui.clubDetails.squadInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentInfoSquadBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.OnClickListener

class SquadInfoFragment: BaseFragment<FragmentInfoSquadBinding, SquadInfoViewModel>
    (R.layout.fragment_info_squad), OnClickListener {

    override fun onStart() {
        super.onStart()
        binding.viewModel = arguments?.getInt(Constant.TEAM_ID_KEY)?.let { SquadInfoViewModel(it) }
        val teamPlayerAdapter = SquadInfoAdapter(emptyList(), this)
        binding.teamPlayers.adapter = teamPlayerAdapter
    }

    override fun getViewModel() = SquadInfoViewModel::class.java

    override fun onClickItem(id: Int, teamId: Int, leagueId: Int) {
        val leagueID = arguments?.getInt(Constant.LEAGUE_ID_KEY)
        arguments?.getInt(Constant.TEAM_ID_KEY)?.let { team ->
            leagueID?.let { leagueID ->
                ClubDetailsFragmentDirections.actionClubDetailsFragmentToPlayerDetailsFragment(
                    id,
                    team,
                    leagueID
                )
            }
        }?.let {
            navigate(it
            )
        }
    }
    companion object : InstantsFragments<SquadInfoFragment>(SquadInfoFragment::class.java)
}
