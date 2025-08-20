package com.example.getblock.network

import android.util.Log
import com.example.getblock.model.Supply
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ApiService(private val client: HttpClient) {

    // DON'T FORGET TO DELETE API KEY BEFORE COMMITTING !!!
    companion object{
        private const val END_POINT = "https://go.getblock.us/c248a77fafb742ba850eac271aeb91bb"
    }

    suspend fun getSupply(): HttpResponse{
        val response: HttpResponse = client.post(END_POINT) {
            setBody("{\"jsonrpc\":\"2.0\", \"id\":1, \"method\":\"getSupply\" }")
            contentType(ContentType.Application.Json)
        }

        return response
    }


}