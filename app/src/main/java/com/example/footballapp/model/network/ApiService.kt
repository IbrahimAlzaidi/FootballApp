package com.example.footballapp.model.network

import com.example.footballapp.model.response.competitions.Competitions
import com.example.footballapp.model.response.standings.Standings
import com.example.footballapp.model.response.teams.Teams
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @GET("/v2/teams/{teamId}")
    suspend fun getTeamsInfo(@Path("teamId") teamId: Int): Response<Teams?>

    @GET("/v2/competitions/")
    suspend fun getCompetitions(): Response<Competitions?>

    @GET("/v2/competitions/{standingsId}/standings")
    suspend fun getStandings(@Path("standingsId") standingsId: Int) : Response<Standings>
}
