package com.example.footballapp.ui.leagueDetails.standing

import android.util.Log
import androidx.navigation.fragment.findNavController
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.OnClickListener

class StandingFragment(private val args: Int?) :
    BaseFragment<FragmentStandingBinding, StandingViewModel>
        (R.layout.fragment_standing), OnClickListener {
    override fun getViewModel() = StandingViewModel::class.java
    override fun setup() {
        binding.viewModel = viewModel
        val standingAdapter = StandingAdapter(emptyList(), this)
        binding.leagueRecycler.adapter = standingAdapter
    }

    override fun onClickItem(id: Int) {
        Log.i(TAG, "onClickItem: $id")
        val action =
            args?.let {
                LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToClubDetailsFragment(
                    id, it
                )
            }
        if (action != null) {
            this.findNavController().navigate(action)
        }
    }

    override val arg: Int?
        get() = args

    override val leagueId: Int?
        get() = null
}
