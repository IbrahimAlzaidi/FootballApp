package com.example.footballapp.ui.home.allMatchScheduled

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentAllMatchScheduledBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.BaseViewModel

class AllMatchScheduledFragment :
    BaseFragment<FragmentAllMatchScheduledBinding, AllMatchScheduledViewModel>(
        R.layout.fragment_all_match_scheduled
    ) {
    override fun setup() {
        binding.viewModel = viewModel
        val allMatchScheduledAdapter = AllMatchAdapter(emptyList())
        binding.matchScheduledRecycler.adapter = allMatchScheduledAdapter
    }

    override fun getViewModel() = AllMatchScheduledViewModel::class.java

    override val leagueId: Int?
        get() = null
    override val arg: Int?
        get() = null

}
