package com.example.footballapp.model

import com.example.footballapp.model.network.Api
import com.example.footballapp.model.response.leagueSearch.LeagueSearch
import com.example.footballapp.model.response.leagues.LeaguesResponse
import com.example.footballapp.model.response.lineup.LineupInfo
import com.example.footballapp.model.response.liveMatches.LiveMatches
import com.example.footballapp.model.response.matchStatistic.MatchStatistic
import com.example.footballapp.model.response.matches.MatchesResults
import com.example.footballapp.model.response.playerStatistic.PlayerStatistic
import com.example.footballapp.model.response.playerTrophies.PlayerTrophies
import com.example.footballapp.model.response.stadiumInfo.StadiumInfo
import com.example.footballapp.model.response.standing.StandingTeams
import com.example.footballapp.model.response.teamInfo.TeamInformation
import com.example.footballapp.model.response.topScorers.TopScorers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response


class Repository {

    // function to get leagues info
    fun getLeaguesInfo(): Flow<State<LeaguesResponse?>> =
        wrapWithFlow { Api.apiService.getLeaguesInfo() }

    // function to get Live matches
    fun getMatchesLive(): Flow<State<LiveMatches?>> =
        wrapWithFlow { Api.apiService.getMatchesLive() }

    // function to get standing for current leagues
    fun getStandingTeams(season: Int = 2021, leagueId: Int): Flow<State<StandingTeams?>> =
        wrapWithFlow { Api.apiService.getStandingTeams(season = season , leagueId = leagueId) }

    // function to get team information
    fun getTeamInformation(leagueId: Int,season:Int=2021,teamId:Int):Flow<State<TeamInformation?>> =
        wrapWithFlow { Api.apiService.getTeamInformation(leagueId = leagueId, season = season, teamId = teamId) }

    // function to get top scorers
    fun getTopScorers(leagueId: Int,season:Int=2021): Flow<State<TopScorers?>> =
        wrapWithFlow { Api.apiService.getTopScorers(leagueId = leagueId, season = season) }

    // function to get stadium info
    fun getStadiumInfo(teamId:Int,leagueId: Int,season:Int=2021): Flow<State<StadiumInfo?>> =
        wrapWithFlow { Api.apiService.getStadiumInfo(teamId = teamId,leagueId = leagueId,season = season) }

    // function to get matches result
    fun getMatchesResult(leagueId: Int,season:Int=2021,status: String = "NS"): Flow<State<MatchesResults?>> =
        wrapWithFlow { Api.apiService.getMatchesResult(leagueId = leagueId,season = season, status = status) }

    // function to get match statistic
    fun getMatchStatistic(matchId: Int): Flow<State<MatchStatistic?>> =
        wrapWithFlow { Api.apiService.getMatchStatistic(matchId) }

    // function to get match lineup
    fun getMatchLineup(matchId: Int): Flow<State<LineupInfo?>> =
        wrapWithFlow { Api.apiService.getMatchLineup(matchId) }

    // function to get player statistic
    fun getPlayerStatistic(playerId: Int,season:Int=2021): Flow<State<PlayerStatistic?>> =
        wrapWithFlow { Api.apiService.getPlayerStatistic(playerId = playerId, season = season) }

    // function to get player trophies
    fun getPlayerTrophies(playerId: Int): Flow<State<PlayerTrophies?>> =
        wrapWithFlow { Api.apiService.getPlayerTrophies(playerId) }

    // function to search league by league name
    fun searchLeague(leagueName: String): Flow<State<LeagueSearch?>> =
        wrapWithFlow { Api.apiService.searchLeague(leagueName) }

    private fun <T> wrapWithFlow(function: suspend () -> Response<T>): Flow<State<T?>> = flow {
        emit(State.Loading)
        emit(check(function()))
    }

    private fun <T> check(response: Response<T>): State<T?> =
        try {
            if (response.isSuccessful) State.Success(response.body())
            else State.Error(response.message())
        } catch (e: Exception) {
            State.Error(e.message.toString())
        }
}
