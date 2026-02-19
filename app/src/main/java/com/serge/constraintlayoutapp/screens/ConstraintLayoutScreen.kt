package com.serge.constraintlayoutapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun ConstraintLayoutScreen() {
    ConstraintLayout(modifier = Modifier
        .background(MaterialTheme.colorScheme.surface)
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        val (gradientBackground, profileImage, notificationImage) = createRefs()

        val horizontalGuideline = createGuidelineFromBottom(0.45f)
        BackgroundGradient(modifier = Modifier.constrainAs(gradientBackground){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(horizontalGuideline)

            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        val topGuideline = createGuidelineFromTop(16.dp)
        val startGuideline = createGuidelineFromStart(30.dp)
        val endGuideline = createGuidelineFromEnd(16.dp)

        ProfileImg(modifier = Modifier.constrainAs(profileImage){
            top.linkTo(topGuideline)
        })


        Notification(modifier = Modifier.constrainAs(notificationImage){
            top.linkTo(profileImage.top)
            bottom.linkTo(profileImage.bottom)
        })
        createHorizontalChain(
            profileImage, notificationImage,
            chainStyle = ChainStyle.SpreadInside
        )
    }
}