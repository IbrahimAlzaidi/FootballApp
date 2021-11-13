package com.example.footballapp.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.footballapp.ui.clubDetails.clubInfo.ClubInformationFragment
import com.example.footballapp.ui.clubDetails.clubMatch.ClubMatchPlayedFragment
import com.example.footballapp.ui.clubDetails.squadInfo.SquadInfoFragment
import com.example.footballapp.ui.leagueDetails.matches.MatchesFragment
import com.example.footballapp.ui.leagueDetails.scorers.ScorersFragment
import com.example.footballapp.ui.leagueDetails.standing.StandingFragment
import com.example.footballapp.ui.matchDetails.lineup.LineupFragment
import com.example.footballapp.ui.matchDetails.matchState.MatchStateFragment
import com.example.footballapp.ui.matchDetails.substitutes.SubstitutesFragment
import com.example.footballapp.ui.playerDetails.matchPlayedStatistic.PlayedStatisticFragment
import com.example.footballapp.ui.playerDetails.playedInfo.PlayerInformationFragment

class FragmentFactory(
    private val arg: Int?,
    private val leagueId: Int?,
    private val teamId: Int?
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment =
        when (loadFragmentClass(classLoader, className)) {
            StandingFragment::class.java -> StandingFragment(leagueID = leagueId)
            ScorersFragment::class.java -> ScorersFragment(args = arg)
            MatchesFragment::class.java -> MatchesFragment(args = arg)
            ClubInformationFragment::class.java -> ClubInformationFragment(
                teamID = teamId,
                leagueID = leagueId
            )
            ClubMatchPlayedFragment::class.java -> ClubMatchPlayedFragment(teamID = teamId)
            SquadInfoFragment::class.java -> SquadInfoFragment(teamID = teamId, leagueID = leagueId)
            LineupFragment::class.java -> LineupFragment(matchID = arg)//
            MatchStateFragment::class.java -> MatchStateFragment(matchID = arg)
            SubstitutesFragment::class.java -> SubstitutesFragment(matchId = arg)
            PlayedStatisticFragment::class.java -> PlayedStatisticFragment(
                playerId = arg,
                leagueID = leagueId
            )
            PlayerInformationFragment::class.java -> PlayerInformationFragment(
                playerId = arg,
                leagueID = leagueId,
                teamID = teamId
            )

            else -> super.instantiate(classLoader, className)
        }
}
