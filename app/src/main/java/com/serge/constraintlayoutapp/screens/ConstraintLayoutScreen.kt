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
        val (gradientBackground, profileImage, notificationImage,
            welcomeText, questionText, joinNowButton, image) = createRefs()

        val horizontalGuideline = createGuidelineFromBottom(0.45f)

        //1 - Bg Gradient

        BackgroundGradient(modifier = Modifier.constrainAs(gradientBackground){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(horizontalGuideline)

            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        val topGuideline = createGuidelineFromTop(50.dp)
        val startGuideline = createGuidelineFromStart(30.dp)
        val endGuideline = createGuidelineFromEnd(16.dp)

        //2 - Header Part

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


        //3 - Middle Part

        WelcomeText(modifier = Modifier.constrainAs(welcomeText){
            top.linkTo(profileImage.bottom, margin = 32.dp)
            start.linkTo(startGuideline)
        })

        QuestionText(modifier = Modifier.constrainAs(questionText){
            top.linkTo(welcomeText.bottom, margin = 10.dp)
            start.linkTo(welcomeText.start)
        })

        JoinNowButton(modifier = Modifier.constrainAs(joinNowButton){
            top.linkTo(questionText.bottom, margin = 32.dp)
            start.linkTo(questionText.start)
            end.linkTo(questionText.end)
        }) { }


        Image(modifier = Modifier.constrainAs(image){
            bottom.linkTo(horizontalGuideline, margin = 12.dp)
            end.linkTo(endGuideline)

            start.linkTo(joinNowButton.end, margin = 8.dp)

            width = Dimension.value(250.dp)
            height = Dimension.value(280.dp)
        })
    }
}