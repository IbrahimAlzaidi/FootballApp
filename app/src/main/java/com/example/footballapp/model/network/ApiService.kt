package com.example.footballapp.model.network

import com.example.footballapp.model.response.leagues.LeaguesResponse
import com.example.footballapp.model.response.liveMatches.LiveMatches
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {


    @GET("/v3/leagues/")
    suspend fun getLeaguesInfo(): Response<LeaguesResponse?>

    @GET("/v3/fixtures?live=all")
    suspend fun getMatchesLive(): Response<LiveMatches?>
}
