package com.example.footballapp.ui.clubDetails.clubInfo

import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentClupInformationBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.base.InstantsFragments
import com.example.footballapp.ui.clubDetails.ClubDetailsFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.Constant.LEAGUE_ID_KEY
import com.example.footballapp.util.Constant.TEAM_ID_KEY
import com.example.footballapp.util.OnClickListener
import com.yarolegovich.discretescrollview.DSVOrientation
import com.yarolegovich.discretescrollview.transform.Pivot
import com.yarolegovich.discretescrollview.transform.ScaleTransformer

class ClubInformationFragment :
    BaseFragment<FragmentClupInformationBinding, ClubInformationViewModel>(R.layout.fragment_clup_information),
    OnClickListener {

    override fun onStart() {
        super.onStart()
        binding.viewModel = ClubInformationViewModel(
            arguments?.getInt(TEAM_ID_KEY),
            arguments?.getInt(LEAGUE_ID_KEY)
        )
        val teamPlayerAdapter = SquadInfoAdapter(emptyList(), this)
        binding.playerRecyclerView.apply {
            adapter = teamPlayerAdapter
            setOrientation(DSVOrientation.HORIZONTAL)
            setOffscreenItems(2)
            setOverScrollEnabled(true)
            setItemTransitionTimeMillis(20)
            setItemTransformer(ScaleTransformer.Builder()
                .setMaxScale(1.1f)
                .setMinScale(0.8f)
                .setPivotX(Pivot.X.CENTER)
                .setPivotY(Pivot.Y.BOTTOM)
                .build())
            setSlideOnFling(true)
        }
    }

    override fun getViewModel() = ClubInformationViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int, leagueId: Int) {
        val leagueID = arguments?.getInt(Constant.LEAGUE_ID_KEY)
        arguments?.getInt(Constant.TEAM_ID_KEY)?.let { team ->
            leagueID?.let { leagueID ->
                ClubDetailsFragmentDirections.actionClubDetailsFragmentToPlayerDetailsFragment(
                    playerId = id,
                    teamId = team,
                    leagueId = leagueID
                )
            }
        }?.let {
            navigate(
                it
            )
        }
    }

    companion object :
        InstantsFragments<ClubInformationFragment>(ClubInformationFragment::class.java)
}
