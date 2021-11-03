package com.example.footballapp.model.repository

import com.example.footballapp.model.network.State
import com.example.footballapp.model.network.Api
import com.example.footballapp.model.response.leagueSearch.LeagueSearchResponse
import com.example.footballapp.model.response.leagues.LeaguesResponse
import com.example.footballapp.model.response.lineup.LineupResponse
import com.example.footballapp.model.response.liveMatches.LiveMatchesResponse
import com.example.footballapp.model.response.matchStatistic.MatchStatisticResponse
import com.example.footballapp.model.response.matches.MatchesResponse
import com.example.footballapp.model.response.playerStatistic.PlayerStatisticResponse
import com.example.footballapp.model.response.playerTrophies.PlayerTrophiesResponse
import com.example.footballapp.model.response.schedulerMatch.SchedulerMatchResponse
import com.example.footballapp.model.response.stadiumInfo.StadiumInfoResponse
import com.example.footballapp.model.response.standing.StandingTeamsResponse
import com.example.footballapp.model.response.teamInfo.TeamInformationResponse
import com.example.footballapp.model.response.topScorers.TopScorersResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response


class Repository {

    // function to get leagues info
    fun getLeaguesInfo(): Flow<State<LeaguesResponse?>> =
        wrapWithFlow { Api.apiService.getLeaguesInfo() }

    // function to get Live matches
    fun getMatchesLive(): Flow<State<LiveMatchesResponse?>> =
        wrapWithFlow { Api.apiService.getMatchesLive() }

    // function to get standing for current leagues
    fun getStandingTeams(season: Int = 2021, leagueId: Int): Flow<State<StandingTeamsResponse?>> =
        wrapWithFlow { Api.apiService.getStandingTeams(season = season , leagueId = leagueId) }

    // function to get team information
    fun getTeamInformation(leagueId: Int,season:Int=2021,teamId:Int):Flow<State<TeamInformationResponse?>> =
        wrapWithFlow { Api.apiService.getTeamInformation(leagueId = leagueId, season = season, teamId = teamId) }

    // function to get top scorers
    fun getTopScorers(leagueId: Int,season:Int=2021): Flow<State<TopScorersResponse?>> =
        wrapWithFlow { Api.apiService.getTopScorers(leagueId = leagueId, season = season) }

    // function to get stadium info
    fun getStadiumInfo(teamId:Int,leagueId: Int,season:Int=2021): Flow<State<StadiumInfoResponse?>> =
        wrapWithFlow { Api.apiService.getStadiumInfo(teamId = teamId,leagueId = leagueId,season = season) }

    // function to get matches result
    fun getMatchesResult(leagueId: Int,season:Int=2021,status: String = "NS"): Flow<State<MatchesResponse?>> =
        wrapWithFlow { Api.apiService.getMatchesResult(leagueId = leagueId,season = season, status = status) }

    // function to get matches result FT
    fun getMatchesResultFT(leagueId: Int=39,season:Int=2021): Flow<State<SchedulerMatchResponse?>> =
        wrapWithFlow { Api.apiService.getMatchesResultFT(leagueId = leagueId,season = season) }

    // function to get match statistic
    fun getMatchStatistic(matchId: Int): Flow<State<MatchStatisticResponse?>> =
        wrapWithFlow { Api.apiService.getMatchStatistic(matchId) }

    // function to get match lineup
    fun getMatchLineup(matchId: Int): Flow<State<LineupResponse?>> =
        wrapWithFlow { Api.apiService.getMatchLineup(matchId) }

    // function to get player statistic
    fun getPlayerStatistic(playerId: Int,season:Int=2021): Flow<State<PlayerStatisticResponse?>> =
        wrapWithFlow { Api.apiService.getPlayerStatistic(playerId = playerId, season = season) }

    // function to get player trophies
    fun getPlayerTrophies(playerId: Int): Flow<State<PlayerTrophiesResponse?>> =
        wrapWithFlow { Api.apiService.getPlayerTrophies(playerId) }

    // function to search league by league name
    fun searchLeague(leagueName: String): Flow<State<LeagueSearchResponse?>> =
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
