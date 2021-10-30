package com.example.footballapp.model

import com.example.footballapp.model.network.Api
import com.example.footballapp.model.response.leagues.LeaguesResponse
import com.example.footballapp.model.response.liveMatches.LiveMatches
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response


class Repository {

    fun getLeaguesInfo(): Flow<State<LeaguesResponse?>> =
        wrapWithFlow { Api.apiService.getLeaguesInfo() }

    fun getMatchesLive(): Flow<State<LiveMatches?>> =
        wrapWithFlow { Api.apiService.getMatchesLive() }

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
