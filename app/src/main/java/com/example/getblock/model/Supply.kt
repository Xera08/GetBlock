package com.example.getblock.model

import kotlinx.serialization.Serializable

@Serializable
data class Supply(
    val result: Result
)

@Serializable
data class Result (
    val value: Value
)

@Serializable
data class Value(
    val circulating: Long,
    val nonCirculating: Long
)