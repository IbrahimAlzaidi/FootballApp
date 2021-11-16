package com.example.footballapp.ui.matchDetails.lineup

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLineupBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.util.Constant

class LineupFragment :
    BaseFragment<FragmentLineupBinding, LineupViewModel>(R.layout.fragment_lineup) {

    override fun getViewModel() = LineupViewModel::class.java
    override fun onStart() {
        super.onStart()
        binding.viewModel = LineupViewModel(arguments?.getInt(Constant.MATCH_ID_KEY))
        val lineupAdapter = LineupAdapter(emptyList())
        binding.lineupRecyclerView.adapter = lineupAdapter
    }

    companion object : InstantsFragments<LineupFragment>(LineupFragment::class.java)
}
