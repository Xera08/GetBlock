package com.example.getblock.ui

import androidx.compose.runtime.Composable
import com.example.getblock.data.GetBlockRepositoryImpl
import com.example.getblock.network.ApiService
import com.example.getblock.network.client
import com.example.getblock.ui.screens.GetBlockViewModel
import com.example.getblock.ui.screens.HomeScreen

@Composable
fun GetBlockApp() {
    val apiService: ApiService = ApiService(client)
    val repository: GetBlockRepositoryImpl = GetBlockRepositoryImpl(apiService)
    val getBlockViewModel: GetBlockViewModel = GetBlockViewModel(repository)
    HomeScreen(getBlockViewModel = getBlockViewModel)
}