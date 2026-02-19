package com.serge.constraintlayoutapp.screens

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import com.serge.constraintlayoutapp.R

@Composable
fun BackgroundGradient(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "Background Gradient",
        modifier = modifier.alpha(0.8f)
    )
}