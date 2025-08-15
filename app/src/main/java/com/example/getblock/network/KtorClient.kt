package com.example.getblock.network

import android.util.Log
import io.ktor.client.*
import io.ktor.client.call.body
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.ContentType
import io.ktor.http.contentType

private const val BASE_URL = "https://go.getblock.io/b387f692c8e34ca491148ad8c900ce22"
private const val GET_UUID = "$BASE_URL/uuid"

/*
curl --location "https://go.getblock.io/b387f692c8e34ca491148ad8c900ce22/" -XPOST \
--header "Content-Type: application/json" \
--data '{
    "jsonrpc": "2.0",
    "id": 1,
    "method": "getBlock",
    "params": [122788843, null]
}'
*/

suspend fun simpleCase() {
    val client = HttpClient(CIO) {
        install(ContentNegotiation)
    }




    val response: HttpResponse = client.get(BASE_URL) {
        url {

        }
        contentType(ContentType.Application.Json)
    }

    Log.i("Ktor Client", response.status.toString())
    Log.i("Ktor Client", response.body())
    client.close()
}