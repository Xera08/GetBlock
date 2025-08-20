package com.example.getblock.ui.screens

import android.util.Log
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.getblock.data.GetBlockRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class GetBlockViewModel (private val getBlockRepositoryImpl: GetBlockRepositoryImpl): ViewModel() {
    private val _circulatingSupply = MutableStateFlow(0L)
    val circulatingSupply: StateFlow<Long> = _circulatingSupply


    fun getSupply() {
        Log.i("ViewModel", "Starting viewModelScope")
        viewModelScope.launch {
            Log.i("ViewModel", "Launching getSupply")
            _circulatingSupply.value = getBlockRepositoryImpl.getSupply().result.value.circulating
            Log.i("ViewModel", _circulatingSupply.value.toString())

        }
    }
}