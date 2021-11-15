package com.example.footballapp.ui.matchDetails.substitutes

import android.os.Bundle
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentSubstitutesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.leagueDetails.standing.StandingFragment
import com.example.footballapp.util.Constant

class SubstitutesFragment() :
    BaseFragment<FragmentSubstitutesBinding, SubstitutesViewModel>(R.layout.fragment_substitutes) {

    override fun setup() {
        val substitutesPlayerAdapter = SubstitutesPlayerAdapter(emptyList())
        binding.playerSubstitutesRecycler.adapter = substitutesPlayerAdapter
    }

    override fun onStart() {
        super.onStart()
        binding.viewModel = SubstitutesViewModel(arguments?.getInt(Constant.MATCH_ID_KEY))
    }

    override fun getViewModel() = SubstitutesViewModel::class.java

    override val arg: Int?
        get() = null

    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

    companion object {
        fun newInstance(matchId: Int?): SubstitutesFragment =
            SubstitutesFragment().apply {
                arguments = Bundle().apply {
                    if (matchId != null) {
                        putInt(Constant.MATCH_ID_KEY, matchId)
                    }
                }
            }
    }

}
