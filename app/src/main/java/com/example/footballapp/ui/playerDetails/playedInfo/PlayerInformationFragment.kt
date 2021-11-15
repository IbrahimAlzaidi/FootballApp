package com.example.footballapp.ui.playerDetails.playedInfo

import android.os.Bundle
import android.util.Log
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentPlayerInformationsBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.util.Constant


class PlayerInformationFragment() : BaseFragment<FragmentPlayerInformationsBinding, PlayerInformationViewModel>(
    R.layout.fragment_player_informations
) {
    override fun setup() {}

    override fun getViewModel(): Class<PlayerInformationViewModel> =
        PlayerInformationViewModel::class.java

    override val arg: Int?
        get() = null
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

    override fun onStart() {
        super.onStart()
        binding.viewModel = PlayerInformationViewModel(
            arguments?.getInt(Constant.PLAYER_ID_KEY),
            arguments?.getInt(Constant.TEAM_ID_KEY),
            arguments?.getInt(Constant.LEAGUE_ID_KEY)
        )
        Log.i(Constant.TAG, "PlayerInformationFragment______________onStart:" +
                " ${arguments?.getInt(Constant.PLAYER_ID_KEY)}" +
                " ${arguments?.getInt(Constant.TEAM_ID_KEY)}" +
                " ${arguments?.getInt(Constant.LEAGUE_ID_KEY)}")

    }

    companion object {
        fun newInstance(playerId: Int?,teamId:Int?, leagueId: Int?): PlayerInformationFragment =
            PlayerInformationFragment().apply {
                arguments = Bundle().apply {
                    if (playerId != null) {
                        putInt(Constant.PLAYER_ID_KEY, playerId)
                    }
                    if (teamId != null) {
                        putInt(Constant.TEAM_ID_KEY, teamId)
                    }
                    if (leagueId != null) {
                        putInt(Constant.LEAGUE_ID_KEY, leagueId)
                    }
                }
            }
    }
}
