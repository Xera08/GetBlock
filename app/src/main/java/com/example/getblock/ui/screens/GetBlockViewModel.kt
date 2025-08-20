package com.example.getblock.ui.screens

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.getblock.data.GetBlockRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class GetBlockViewModel (private val getBlockRepositoryImpl: GetBlockRepositoryImpl): ViewModel() {
    private val _circulatingSupply: MutableStateFlow<Int> = MutableStateFlow(0)
    var ciculatingSupply: Int = _circulatingSupply.value


    fun getSupply() {
        viewModelScope.launch {
            getBlockRepositoryImpl.getSupply().fold(
                onSuccess = {},
                onFailure = {}

            )

        }
    }
}