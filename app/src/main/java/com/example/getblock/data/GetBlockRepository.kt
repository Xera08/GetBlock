package com.example.getblock.data

import com.example.getblock.model.Supply

interface GetBlockRepository {
    suspend fun getSupply(): Supply
}