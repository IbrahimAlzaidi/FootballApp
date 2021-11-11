package com.example.footballapp.ui.playerDetails.playedInfo

import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerInformationsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant


class PlayerInformationFragment(
    private val playerId: Int,
    private val teamID: Int,
    private val leagueID: Int
) : BaseFragment<FragmentPlayerInformationsBinding, PlayerInformationViewModel>(
    R.layout.fragment_player_informations
) {
    override fun setup() {
        Log.i(Constant.TAG, "Player__________DetailsFragment: $playerId - $teamID - $leagueID ")
    }

    override fun getViewModel(): Class<PlayerInformationViewModel> =
        PlayerInformationViewModel::class.java

    override val arg: Int
        get() = playerId
    override val leagueId: Int
        get() = leagueID
    override val teamId: Int
        get() = teamID
}
