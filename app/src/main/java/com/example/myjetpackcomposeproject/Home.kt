package com.example.myjetpackcomposeproject

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Home(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        contentColor = Color.White) {
        Column {
            Text(
                text = "Home PAge", fontSize = 25.sp, color = Color.Blue,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )
        }
    }

}