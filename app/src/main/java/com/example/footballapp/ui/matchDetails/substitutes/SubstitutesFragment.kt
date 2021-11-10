package com.example.footballapp.ui.matchDetails.substitutes

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentSubstitutesBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel

class SubstitutesFragment(private val matchId: Int?) :
    BaseFragment<FragmentSubstitutesBinding, SubstitutesViewModel>(R.layout.fragment_substitutes) {

    override fun setup() {
        binding.viewModel = viewModel
        val substitutesPlayerAdapter = SubstitutesPlayerAdapter(emptyList())
        binding.playerSubstitutesRecycler.adapter = substitutesPlayerAdapter
    }

    override fun getViewModel() = SubstitutesViewModel::class.java

    override val arg: Int?
        get() = matchId

    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
