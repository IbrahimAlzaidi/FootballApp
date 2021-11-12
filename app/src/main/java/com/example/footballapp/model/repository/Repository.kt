package com.example.footballapp.model.repository

import com.example.footballapp.model.network.Api
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.fixtureData.FixtureDataResponse
import com.example.footballapp.model.response.leagueSearch.LeagueSearchResponse
import com.example.footballapp.model.response.leagues.LeaguesResponse
import com.example.footballapp.model.response.lineup.LineupResponse
import com.example.footballapp.model.response.liveMatches.LiveMatchesResponse
import com.example.footballapp.model.response.matchScheduled.MatchScheduledResponse
import com.example.footballapp.model.response.matchStatistic.MatchStatisticResponse
import com.example.footballapp.model.response.matches.MatchesResponse
import com.example.footballapp.model.response.playerStatistic.PlayerStatisticResponse
import com.example.footballapp.model.response.playerTrophies.PlayerTrophiesResponse
import com.example.footballapp.model.response.schedulerMatch.SchedulerMatchResponse
import com.example.footballapp.model.response.squadPlayer.SquadPlayer
import com.example.footballapp.model.response.stadiumInfo.StadiumInfoResponse
import com.example.footballapp.model.response.standing.StandingTeamsResponse
import com.example.footballapp.model.response.teamCurrentMatch.CurrentTeamMatchResponse
import com.example.footballapp.model.response.teamInfo.TeamInformationResponse
import com.example.footballapp.model.response.topScorers.TopScorersResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import java.util.*

class Repository {

    fun getLeaguesInfo(): Flow<State<LeaguesResponse?>> =
        wrapWithFlow { Api.apiService.getLeaguesInfo() }

    fun getMatchesLive(): Flow<State<LiveMatchesResponse?>> =
        wrapWithFlow { Api.apiService.getMatchesLive() }

    fun getStandingTeams(
        season: Int = CURRENT_YEAR,
        leagueId: Int,
    ): Flow<State<StandingTeamsResponse?>> =
        wrapWithFlow { Api.apiService.getStandingTeams(season = season, leagueId = leagueId) }

    fun getTeamInformation(
        leagueId: Int,
        season: Int = CURRENT_YEAR,
        teamId: Int,
    ): Flow<State<TeamInformationResponse?>> =
        wrapWithFlow {
            Api.apiService.getTeamInformation(
                leagueId = leagueId,
                season = season,
                teamId = teamId
            )
        }

    fun getTopScorers(
        leagueId: Int,
        season: Int = CURRENT_YEAR,
    ): Flow<State<TopScorersResponse?>> =
        wrapWithFlow { Api.apiService.getTopScorers(leagueId = leagueId, season = season) }

    fun getStadiumInfo(
        teamId: Int,
        leagueId: Int,
        season: Int = CURRENT_YEAR,
    ): Flow<State<StadiumInfoResponse?>> =
        wrapWithFlow {
            Api.apiService.getStadiumInfo(
                teamId = teamId,
                leagueId = leagueId,
                season = season
            )
        }

    fun getMatchesResult(
        leagueId: Int,
        season: Int = CURRENT_YEAR,
        status: String = "NS",
    ): Flow<State<MatchesResponse?>> =
        wrapWithFlow {
            Api.apiService.getMatchesResult(
                leagueId = leagueId,
                season = season,
                status = status
            )
        }

    fun getMatchesResultFT(
        leagueId: Int = 39,
        season: Int = CURRENT_YEAR,
    ): Flow<State<SchedulerMatchResponse?>> =
        wrapWithFlow { Api.apiService.getMatchesResultFT(leagueId = leagueId, season = season) }

    fun getMatchStatistic(matchId: Int): Flow<State<MatchStatisticResponse?>> =
        wrapWithFlow { Api.apiService.getMatchStatistic(matchId) }

    fun getMatchLineup(matchId: Int): Flow<State<LineupResponse?>> =
        wrapWithFlow { Api.apiService.getMatchLineup(matchId) }

    fun getPlayerStatistic(
        playerId: Int,
        season: Int = CURRENT_YEAR,
        leagueId: Int,
    ): Flow<State<PlayerStatisticResponse?>> =
        wrapWithFlow {
            Api.apiService.getPlayerStatistic(
                playerId = playerId,
                season = season,
                leagueId = leagueId
            )
        }

    fun getPlayerTrophies(playerId: Int): Flow<State<PlayerTrophiesResponse?>> =
        wrapWithFlow { Api.apiService.getPlayerTrophies(playerId) }

    fun searchLeague(leagueName: String): Flow<State<LeagueSearchResponse?>> =
        wrapWithFlow { Api.apiService.searchLeague(leagueName) }

    fun getLatestMatchScheduled(
        matchCount: Int = 50,
        leagueId: Int?,
    ): Flow<State<MatchScheduledResponse?>> =
        wrapWithFlow { Api.apiService.getLatestMatchScheduled(matchCount, leagueId) }

    fun getTeamPlayerInfo(teamId: Int, playerId: Int?): Flow<State<SquadPlayer?>> =
        wrapWithFlow { Api.apiService.getTeamPlayer(teamId, playerId) }

    fun getTeamMatchPlayed(
        season: Int = CURRENT_YEAR,
        teamId: Int,
        status: String = "FT",
    ): Flow<State<CurrentTeamMatchResponse?>> =
        wrapWithFlow { Api.apiService.getTeamMatchPlayed(season, teamId, status) }

    fun getAllMatchData(matchId: Int): Flow<State<FixtureDataResponse?>> =
        wrapWithFlow { Api.apiService.getAllMatchDetails(matchId) }


    private fun <T> wrapWithFlow(function: suspend () -> Response<T>): Flow<State<T?>> = flow {
        emit(State.Loading)
        try {
            val result = function()
            if (result.isSuccessful) {
                emit(State.Success(result.body()))
            } else {
                emit(State.Error(result.message()))
            }
        } catch (e: Exception) {
            emit(State.Error(e.message.toString()))
        }
    }.catch { e ->
        emit(State.Error("Response Error: ${e.message}"))
    }

    companion object {
        val CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR)
    }
}
