package com.example.footballapp.ui.home.allMatchScheduled

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentAllMatchScheduledBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.HomeFragmentDirections
import com.example.footballapp.ui.home.OnClickMatch

class AllMatchScheduledFragment(override val arg: Int?) :
    BaseFragment<FragmentAllMatchScheduledBinding, AllMatchScheduledViewModel>(R.layout.fragment_all_match_scheduled),OnClickMatch{
    override fun setup() {
        binding.viewModel = viewModel
        val allMatchScheduledAdapter = AllMatchAdapter(emptyList(), this)
        binding.matchScheduledRecycler.adapter = allMatchScheduledAdapter
    }

    override fun getViewModel(): Class<AllMatchScheduledViewModel> =
        AllMatchScheduledViewModel::class.java

    override fun onClickMatch(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToMatchDetailsFragment(id)
        this.findNavController().navigate(action)
    }
}
