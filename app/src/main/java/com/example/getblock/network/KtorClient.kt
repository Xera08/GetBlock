package com.example.getblock.network

import android.util.Log
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

private const val BASE_URL = "https://httpbin.org"
private const val GET_UUID = "$BASE_URL/uuid"

suspend fun simpleCase() {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://ktor.io/")
    Log.i("Ktor Client", response.status.toString())
}