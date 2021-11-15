package com.example.footballapp.model.repository

import android.icu.util.Calendar
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
import com.example.footballapp.util.Constant.MATCH_COUNT
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class Repository {

    private val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    // function to get leagues info
    fun getLeaguesInfo(): Flow<State<LeaguesResponse?>> =
        wrapWithFlow { Api.apiService.getLeaguesInfo() }

    // function to get Live matches
    fun getMatchesLive(): Flow<State<LiveMatchesResponse?>> =
        wrapWithFlow { Api.apiService.getMatchesLive() }

    // function to get standing for current leagues
    fun getStandingTeams(season: Int = currentYear, leagueId: Int): Flow<State<StandingTeamsResponse?>> =
        wrapWithFlow { Api.apiService.getStandingTeams(season = season, leagueId = leagueId) }

    // function to get team information
    fun getTeamInformation(
        leagueId: Int,
        season: Int = currentYear,
        teamId: Int
    ): Flow<State<TeamInformationResponse?>> =
        wrapWithFlow {
            Api.apiService.getTeamInformation(
                leagueId = leagueId,
                season = season,
                teamId = teamId
            )
        }

    // function to get top scorers
    fun getTopScorers(leagueId: Int, season: Int = currentYear): Flow<State<TopScorersResponse?>> =
        wrapWithFlow { Api.apiService.getTopScorers(leagueId = leagueId, season = season) }

    // function to get stadium info
    fun getStadiumInfo(
        teamId: Int,
        leagueId: Int,
        season: Int = currentYear
    ): Flow<State<StadiumInfoResponse?>> =
        wrapWithFlow {
            Api.apiService.getStadiumInfo(
                teamId = teamId,
                leagueId = leagueId,
                season = season
            )
        }

    // function to get matches result
    fun getMatchesResult(
        leagueId: Int,
        season: Int = currentYear,
        status: String = "NS"
    ): Flow<State<MatchesResponse?>> =
        wrapWithFlow {
            Api.apiService.getMatchesResult(
                leagueId = leagueId,
                season = season,
                status = status
            )
        }

    // function to get matches result FT
    fun getMatchesResultFT(
        leagueId: Int ,
        season: Int = currentYear
    ): Flow<State<SchedulerMatchResponse?>> =
        wrapWithFlow { Api.apiService.getMatchesResultFT(leagueId = leagueId, season = season) }

    // function to get match statistic
    fun getMatchStatistic(matchId: Int): Flow<State<MatchStatisticResponse?>> =
        wrapWithFlow { Api.apiService.getMatchStatistic(matchId) }

    // function to get match lineup
    fun getMatchLineup(matchId: Int): Flow<State<LineupResponse?>> =
        wrapWithFlow { Api.apiService.getMatchLineup(matchId) }

    // function to get player statistic
    fun getPlayerStatistic(
        playerId: Int,
        season: Int = currentYear,
        leagueId: Int,
    ): Flow<State<PlayerStatisticResponse?>> =
        wrapWithFlow {
            Api.apiService.getPlayerStatistic(
                playerId = playerId,
                season = season,
                leagueId = leagueId
            )
        }

    // function to get player trophies
    fun getPlayerTrophies(playerId: Int): Flow<State<PlayerTrophiesResponse?>> =
        wrapWithFlow { Api.apiService.getPlayerTrophies(playerId) }

    // function to search league by league name
    fun searchLeague(leagueName: String): Flow<State<LeagueSearchResponse?>> =
        wrapWithFlow { Api.apiService.searchLeague(leagueName) }

    fun getLatestMatchScheduled(
        matchCount: Int = MATCH_COUNT,
        leagueId: Int?= null
    ): Flow<State<MatchScheduledResponse?>> =
        wrapWithFlow { Api.apiService.getLatestMatchScheduled(matchCount, leagueId) }

    fun getTeamPlayerInfo(teamId: Int, playerId: Int? = null): Flow<State<SquadPlayer?>> =
        wrapWithFlow { Api.apiService.getTeamPlayer(teamId, playerId) }

    fun getTeamMatchPlayed(
        season: Int = currentYear,
        teamId: Int,
        status: String = "FT"
    ): Flow<State<CurrentTeamMatchResponse?>> =
        wrapWithFlow { Api.apiService.getTeamMatchPlayed(season, teamId, status) }

    fun getAllMatchData(matchId: Int): Flow<State<FixtureDataResponse?>> =
        wrapWithFlow { Api.apiService.getAllMatchDetails(matchId) }


    private fun <T> wrapWithFlow(function: suspend () -> Response<T>): Flow<State<T?>> = flow {
        emit(State.Loading)
        delay(1000)
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
    }.catch{ e ->
       emit(State.Error("Response Error: ${e.message}"))
    }
}
