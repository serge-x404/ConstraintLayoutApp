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
            welcomeText, questionText, joinNowButton, image, card, coursesText, courseImageAndroid,
            courseImageJava, courseImagePython,
            androidText, javaText, pythonText) = createRefs()

        val (latestLessonText, seeAllText, lessonCard) = createRefs()

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
            bottom.linkTo(horizontalGuideline, margin = 32.dp)
            end.linkTo(endGuideline)

//            start.linkTo(joinNowButton.end, margin = 8.dp)

            width = Dimension.value(250.dp)
            height = Dimension.value(280.dp)
        })


        MyCard(modifier = Modifier.constrainAs(card){
            top.linkTo(horizontalGuideline, margin = (-32).dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        TextOurCourses(modifier = Modifier.constrainAs(coursesText){
            top.linkTo(card.top, margin = 16.dp)
            start.linkTo(card.start, margin = 20.dp)
        })

        AndroidCourseImage(modifier = Modifier.constrainAs(courseImageAndroid){
            top.linkTo(coursesText.bottom, margin = 16.dp)
        })

        JavaCourseImage(modifier = Modifier.constrainAs(courseImageJava){
            top.linkTo(courseImageAndroid.top)
            bottom.linkTo(courseImageAndroid.bottom)
        })

        PythonCourseImage(modifier = Modifier.constrainAs(courseImagePython){
            top.linkTo(courseImageAndroid.top)
            bottom.linkTo(courseImageAndroid.bottom)
        })

        createHorizontalChain(
            courseImageAndroid, courseImageJava, courseImagePython,
            chainStyle = ChainStyle.Spread
        )

        AndroidText(modifier = Modifier.constrainAs(androidText){
            top.linkTo(courseImageAndroid.bottom, margin = 12.dp)
            start.linkTo(courseImageAndroid.start)
            end.linkTo(courseImageAndroid.end)
        })

        JavaText(modifier = Modifier.constrainAs(javaText){
            top.linkTo(courseImageJava.bottom, margin = 12.dp)
            start.linkTo(courseImageJava.start)
            end.linkTo(courseImageJava.end)
        })

        PythonText(modifier = Modifier.constrainAs(pythonText){
            top.linkTo(courseImagePython.bottom, margin = 12.dp)
            start.linkTo(courseImagePython.start)
            end.linkTo(courseImagePython.end)
        })

        LatestLessonsText(modifier = Modifier.constrainAs(latestLessonText){
            top.linkTo(androidText.bottom, margin = 20.dp)
            start.linkTo(startGuideline)
        })

        SeeAllText(modifier = Modifier.constrainAs(seeAllText){
            top.linkTo(androidText.bottom, margin = 20.dp)
            end.linkTo(endGuideline)
        })


        LatestLessonCard(modifier = Modifier.constrainAs(lessonCard){
            top.linkTo(latestLessonText.bottom, margin = 16.dp)
            start.linkTo(latestLessonText.start)
            end.linkTo(endGuideline)
            width = Dimension.fillToConstraints
            height = Dimension.wrapContent
        })
    }
}