package com.serge.constraintlayoutapp.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeText(modifier: Modifier) {
    Text(
        "Welcome Back",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = modifier
    )
}