package com.example.footballapp.model.network

import com.example.footballapp.model.response.leagueSearch.LeagueSearchResponse
import com.example.footballapp.model.response.leagues.LeaguesResponse
import com.example.footballapp.model.response.lineup.LineupInfoResponse
import com.example.footballapp.model.response.liveMatches.LiveMatchesResponse
import com.example.footballapp.model.response.matchStatistic.MatchStatisticResponse
import com.example.footballapp.model.response.matches.MatchesResponse
import com.example.footballapp.model.response.playerStatistic.PlayerStatisticResponse
import com.example.footballapp.model.response.playerTrophies.PlayerTrophiesResponse
import com.example.footballapp.model.response.stadiumInfo.StadiumInfoResponse
import com.example.footballapp.model.response.standing.StandingTeamsResponse
import com.example.footballapp.model.response.teamInfo.TeamInformationResponse
import com.example.footballapp.model.response.topScorers.TopScorersResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/v3/leagues/")
    suspend fun getLeaguesInfo(): Response<LeaguesResponse?>

    @GET("/v3/fixtures?live=all")
    suspend fun getMatchesLive(): Response<LiveMatchesResponse?>

    @GET("/v3/standings")
    suspend fun getStandingTeams(
        @Query("season") season: Int,
        @Query("leagueInfo") leagueId: Int,
    ): Response<StandingTeamsResponse>

    @GET("/v3/teams/statistics")
    suspend fun getTeamInformation(
        @Query("leagueInfo") leagueId: Int,
        @Query("season") season: Int,
        @Query("teamInfo") teamId: Int,
    ): Response<TeamInformationResponse?>

    @GET("/v3/players/topscorers")
    suspend fun getTopScorers(
        @Query("leagueInfo") leagueId: Int,
        @Query("season") season: Int,
    ): Response<TopScorersResponse?>

    @GET("/v3/teams")
    suspend fun getStadiumInfo(
        @Query("id") teamId: Int,
        @Query("leagueInfo") leagueId: Int,
        @Query("season") season: Int,
    ): Response<StadiumInfoResponse?>

    @GET("/v3/fixtures")
    suspend fun getMatchesResult(
        @Query("leagueInfo") leagueId: Int,
        @Query("season") season: Int,
        @Query("status") status: String,
    ): Response<MatchesResponse?>

    @GET("/v3/fixtures/statistics")
    suspend fun getMatchStatistic(@Query("fixture") matchId: Int): Response<MatchStatisticResponse?>

    @GET("/v3/fixtures/lineups")
    suspend fun getMatchLineup(@Query("fixture") matchId: Int): Response<LineupInfoResponse?>

    @GET("/v3/players")
    suspend fun getPlayerStatistic(
        @Query("id") playerId: Int,
        @Query("season") season: Int,
    ): Response<PlayerStatisticResponse?>

    @GET("/v3/trophies")
    suspend fun getPlayerTrophies(@Query("playerInfo") playerId: Int): Response<PlayerTrophiesResponse?>

    @GET("/v3/leagues")
    suspend fun searchLeague(@Query("name") leagueName: String): Response<LeagueSearchResponse?>
}
