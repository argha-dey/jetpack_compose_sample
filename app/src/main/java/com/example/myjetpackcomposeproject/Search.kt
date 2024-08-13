package com.example.myjetpackcomposeproject

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Search(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        contentColor = Color.White) {
        Column {
            Text(
                text = "Search Page", fontSize = 25.sp, color = Color.Blue,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )
        }
    }
}