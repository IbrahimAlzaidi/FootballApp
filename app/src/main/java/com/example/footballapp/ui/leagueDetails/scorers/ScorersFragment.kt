package com.example.footballapp.ui.leagueDetails.scorers

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentScorersBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.util.FragmentFactory
import com.example.footballapp.util.OnClickListener

class ScorersFragment(private val args: Int?): BaseFragment<FragmentScorersBinding, ScorersViewModel>
    (R.layout.fragment_scorers), OnClickListener{


    override fun setup() {
        val topScoreAdapter = ScorersAdapter(emptyList(),this)
        binding.topScoreRecycler.adapter = topScoreAdapter
    }

    override fun getViewModel()= ScorersViewModel::class.java

    override fun onClickItem(id: Int, teamId: Int?, leagueId: Int?) {
        navigate(LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToPlayerDetailsFragment(id,teamId!!,leagueId!!)
        )
        Log.i(TAG, "ScorersFragmentOnClickItem: $id $teamId $leagueId")
    }
    override val arg: Int?
        get() = args
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

}
