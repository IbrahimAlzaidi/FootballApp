package com.example.footballapp.ui.matchDetails.lineup

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLineupBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel

class LineupFragment(private val matchID: Int?) :
    BaseFragment<FragmentLineupBinding, LineupViewModel>(R.layout.fragment_lineup) {

    override fun setup() {
        val lineupAdapter = LineupAdapter(emptyList())
        binding.lineupRecyclerView.adapter = lineupAdapter
    }

    override fun getViewModel() = LineupViewModel::class.java

    override val arg: Int?
        get() = matchID

    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
