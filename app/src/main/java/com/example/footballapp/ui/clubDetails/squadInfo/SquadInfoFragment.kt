package com.example.footballapp.ui.clubDetails.squadInfo

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentInfoSquadBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.OnClickListener

class SquadInfoFragment(private val teamId: Int?) :
    BaseFragment<FragmentInfoSquadBinding, SquadInfoViewModel>(R.layout.fragment_info_squad),
    OnClickListener {

    override fun setup() {
        binding.viewModel = viewModel
        val teamPlayerAdapter = SquadInfoAdapter(emptyList(), this)
        binding.teamPlayers.adapter = teamPlayerAdapter
    }

    override fun getViewModel(): Class<SquadInfoViewModel> = SquadInfoViewModel::class.java
    override val leagueId: Int?
        get() = null
    override val arg: Int?
        get() = teamId

    override fun onClickItem(id: Int) {
        val action =
            ClubDetailsFragmentDirections.actionClubDetailsFragmentToPlayerDetailsFragment(id)
        this.findNavController().navigate(action)
    }
}
