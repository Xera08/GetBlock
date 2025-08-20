package com.example.getblock.data

import com.example.getblock.model.Supply
import com.example.getblock.network.ApiService
import io.ktor.client.call.body

class GetBlockRepositoryImpl (private val apiService: ApiService): GetBlockRepository {

    override suspend fun getSupply(): Supply {
        return apiService.getSupply().body<Supply>()
    }
}