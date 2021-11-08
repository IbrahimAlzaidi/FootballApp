package com.example.footballapp.ui.matchDetails.lineup

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLineupBinding
import com.example.footballapp.ui.base.BaseFragment

class LineupFragment(private val matchID: Int?) : BaseFragment<FragmentLineupBinding,LineupViewModel>(R.layout.fragment_lineup){
    override fun setup() {
        binding.viewModel = viewModel
    }

    override fun getViewModel(): Class<LineupViewModel> = LineupViewModel::class.java

    override val arg: Int?
        get() = matchID
    override val leagueId: Int?
        get() = null
}
