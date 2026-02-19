package com.serge.constraintlayoutapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.serge.constraintlayoutapp.R

@Composable
fun ProfileImg(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.outline_person_24),
        contentDescription = "Android Logo",
        modifier = modifier
            .padding(start = 16.dp)
            .clip(CircleShape)
            .size(42.dp)
    )
}


@Composable
fun Notification(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.outline_notifications_active_24),
        contentDescription = "Notification",
        modifier = modifier
            .padding(end = 16.dp)
            .clip(CircleShape)
            .size(42.dp)
    )
}