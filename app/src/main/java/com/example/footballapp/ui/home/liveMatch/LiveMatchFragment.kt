package com.example.footballapp.ui.home.liveMatch

import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentLiveMatchBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.home.HomeFragmentDirections
import com.example.footballapp.util.OnClickListener

class LiveMatchFragment :
    BaseFragment<FragmentLiveMatchBinding, LiveMatchViewModel>(R.layout.fragment_live_match),
    OnClickListener {

    override fun setup() {
        binding.viewModel = viewModel
        val matchAdapter = LiveMatchAdapter(mutableListOf(), this)
        binding.matchRecycler.adapter = matchAdapter
    }

    override fun onClickItem(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToMatchDetailsFragment(id)
        this.findNavController().navigate(action)
    }

    override fun getViewModel() = LiveMatchViewModel::class.java

    override val leagueId: Int?
        get() = null

    override val arg: Int?
        get() = null
}
