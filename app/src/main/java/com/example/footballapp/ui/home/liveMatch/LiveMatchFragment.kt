package com.example.footballapp.ui.home.liveMatch

import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLiveMatchBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.HomeFragmentDirections
import com.example.footballapp.ui.home.OnClickMatch


class LiveMatchFragment(override val arg: Int?) :
    BaseFragment<FragmentLiveMatchBinding, LiveMatchViewModel>(R.layout.fragment_live_match),OnClickMatch {

    override fun setup() {
        binding.viewModel = viewModel
        val matchAdapter = LiveMatchAdapter(mutableListOf(), this)
        binding.matchRecycler.adapter = matchAdapter
    }

    override fun getViewModel(): Class<LiveMatchViewModel> = LiveMatchViewModel::class.java
    
    override fun onClickMatch(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToMatchDetailsFragment(id)
        this.findNavController().navigate(action)
    }
}
