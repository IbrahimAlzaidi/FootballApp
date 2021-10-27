package com.example.footballapp.model

import com.example.footballapp.model.network.Api
import com.example.footballapp.model.response.competitions.competitions
import com.example.footballapp.model.response.standings.Standings
import com.example.footballapp.model.response.teams.Teams
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response


class Repository {

    fun getTeamsInfo(teamId: Int): Flow<State<Teams?>> =
        wrapWithFlow { Api.apiService.getTeamsInfo(teamId) }

    fun getCompetitions(): Flow<State<competitions?>> =
        wrapWithFlow { Api.apiService.getCompetitions() }

    fun getStandings(standingsId: Int): Flow<State<Standings?>> =
        wrapWithFlow { Api.apiService.getStandings(standingsId) }

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
