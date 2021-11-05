package com.example.footballapp.ui.matchDetails.matchLineups

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentMatchLineupsBinding
import com.example.footballapp.ui.base.BaseFragment

class MatchLineupsFragment(private val args: Int?) :
    BaseFragment<FragmentMatchLineupsBinding, MatchLineupsViewModel>(R.layout.fragment_match_lineups) {
    override fun setup() {

    }

    override fun getViewModel(): Class<MatchLineupsViewModel> = MatchLineupsViewModel::class.java

    override val arg: Int?
        get() = null
}
