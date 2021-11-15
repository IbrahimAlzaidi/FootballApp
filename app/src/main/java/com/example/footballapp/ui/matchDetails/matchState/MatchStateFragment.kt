package com.example.footballapp.ui.matchDetails.matchState

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchStateBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.Instance
import com.example.footballapp.util.Constant

class MatchStateFragment() :
    BaseFragment<FragmentMatchStateBinding, MatchStateViewModel>(R.layout.fragment_match_state) {

    override fun setup() {
        val matchStatisticInformation = MatchStateAdapter(emptyList())
        binding.myRecycle.adapter = matchStatisticInformation
    }

    override fun getViewModel() = MatchStateViewModel::class.java

    override val arg: Int?
        get() = null

    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

    override fun onStart() {
        super.onStart()
        binding.viewModel = MatchStateViewModel(arguments?.getInt(Constant.MATCH_ID_KEY))
    }
    companion object : Instance<MatchStateFragment>(MatchStateFragment::class.java)


}
