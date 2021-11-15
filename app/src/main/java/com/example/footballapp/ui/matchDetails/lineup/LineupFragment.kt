package com.example.footballapp.ui.matchDetails.lineup

import android.os.Bundle
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLineupBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant

class LineupFragment() :
    BaseFragment<FragmentLineupBinding, LineupViewModel>(R.layout.fragment_lineup) {

    override fun setup() {
        val lineupAdapter = LineupAdapter(emptyList())
        binding.lineupRecyclerView.adapter = lineupAdapter
    }

    override fun getViewModel() = LineupViewModel::class.java

    override val arg: Int?
        get() = null

    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

    override fun onStart() {
        super.onStart()
        binding.viewModel = LineupViewModel(arguments?.getInt(Constant.MATCH_ID_KEY))
    }
    companion object {
        fun newInstance(matchId: Int?): LineupFragment =
            LineupFragment().apply {
                arguments = Bundle().apply {
                    if (matchId != null) {
                        putInt(Constant.MATCH_ID_KEY, matchId)
                    }
                }
            }
    }

}
