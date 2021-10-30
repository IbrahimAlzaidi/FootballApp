package com.example.footballapp.model.network

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
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/v3/leagues/")
    suspend fun getLeaguesInfo(): Response<LeaguesResponse?>

    @GET("/v3/fixtures?live=all")
    suspend fun getMatchesLive(): Response<LiveMatches?>

    @GET("/v3/standings")
    suspend fun getStandingTeams(
        @Query("season") season: Int,
        @Query("league") leagueId: Int,
    ): Response<StandingTeams>

    @GET("/v3/teams/statistics")
    suspend fun getTeamInformation(
        @Query("league") leagueId: Int,
        @Query("season") season: Int,
        @Query("team") teamId: Int,
    ): Response<TeamInformation?>

    @GET("/v3/players/topscorers")
    suspend fun getTopScorers(
        @Query("league") leagueId: Int,
        @Query("season") season: Int,
    ): Response<TopScorers?>

    @GET("/v3/teams")
    suspend fun getStadiumInfo(
        @Query("id") teamId: Int,
        @Query("league") leagueId: Int,
        @Query("season") season: Int,
    ): Response<StadiumInfo?>

    @GET("/v3/fixtures")
    suspend fun getMatchesResult(
        @Query("league") leagueId: Int,
        @Query("season") season: Int,
        @Query("status") status: String,
    ): Response<MatchesResults?>

    @GET("/v3/fixtures/statistics")
    suspend fun getMatchStatistic(@Query("fixture") matchId: Int): Response<MatchStatistic?>

    @GET("/v3/fixtures/lineups")
    suspend fun getMatchLineup(@Query("fixture") matchId: Int): Response<LineupInfo?>

    @GET("/v3/players")
    suspend fun getPlayerStatistic(
        @Query("id") playerId: Int,
        @Query("season") season: Int,
    ): Response<PlayerStatistic?>

    @GET("/v3/trophies")
    suspend fun getPlayerTrophies(@Query("player") playerId: Int): Response<PlayerTrophies?>

    @GET("/v3/leagues")
    suspend fun searchLeague(@Query("name") leagueName: String): Response<LeagueSearch?>
}
