package com.example.footballapp.ui.clubDetails.squadInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentInfoSquadBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class SquadInfoFragment(private val teamID: Int?, private val leagueID: Int?) :
    BaseFragment<FragmentInfoSquadBinding, SquadInfoViewModel>(R.layout.fragment_info_squad), OnClickListener{

    override fun setup() {
        val teamPlayerAdapter = SquadInfoAdapter(emptyList(), this)
        binding.teamPlayers.adapter = teamPlayerAdapter
    }

    override fun getViewModel() = SquadInfoViewModel::class.java

    override fun onClickItem(id: Int, teamId: Int?) {
        navigate(ClubDetailsFragmentDirections.actionClubDetailsFragmentToPlayerDetailsFragment(id,teamID!!,leagueID!!))
    }

    override val leagueId: Int?
        get() = leagueID
    override val arg: Int?
        get() = teamID
    override val teamId: Int?
        get() = null

}
