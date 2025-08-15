package com.example.getblock.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.getblock.network.simpleCase
import com.example.getblock.ui.theme.MainGradient
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


@Composable
fun HomeScreen() {
    val searchRequest: String by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
        ,
    ) {
        Box(
            modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(colors = MainGradient),

                    )
                .padding(24.dp)
                .fillMaxWidth()
        ) {
            Column() {
                Row() {
                    Text(
                        text = "SOLSCAN"
                    )
                }
                Box() {
                    Text(
                        text = "Explore Solana Blockchain"
                    )
                    IconButton(
                        onClick = {
                            GlobalScope.launch {
                                simpleCase()
                            } 
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Search,
                            contentDescription = "Search button"
                        )
                    }

                }


                TextField(
                    value = searchRequest,
                    onValueChange = {},
                    modifier = Modifier
                )

            }
        }

        Column(
            modifier = Modifier
                .padding(16.dp)
                .shadow(10.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(16.dp)
                .fillMaxWidth()


        ) {
            Text(text = "SOL Supply \n ")
        }

    }
}