package com.serge.constraintlayoutapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.serge.constraintlayoutapp.R

@Composable
fun LatestLessonsText(modifier: Modifier) {
    Text(
        "Latest Lesson",
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Black,
        modifier = modifier
    )
}


@Composable
fun SeeAllText(modifier: Modifier) {
    Text(
        "See All",
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Blue,
        modifier = modifier
    )
}


@Composable
fun LatestLessonCard(modifier: Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
    ) {
        Box(modifier = Modifier
            .wrapContentSize(Alignment.TopStart)
            .fillMaxHeight()
            .background(Color.White)
        ) {
            Spacer(modifier = Modifier.width(8.dp))

            ConstraintLayout(modifier = Modifier.fillMaxSize()) {

                val (lessonDate, timeImage, schedule, dataset, windowTitle, lessonDesc) = createRefs()

                Text(
                    "Lesson Date",
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(lessonDate){
                        top.linkTo(parent.top, margin = 12.dp)
                        start.linkTo(parent.start, margin = 24.dp)
                    }
                )

                Image(
                    painter = painterResource(R.drawable.baseline_access_time_24),
                    contentDescription = null,
                    modifier = Modifier.constrainAs(timeImage){
                        top.linkTo(lessonDate.bottom, margin = 8.dp)
                        start.linkTo(lessonDate.start)
                    }
                )

                Text(
                    "Tue Feb 24 | 10:00 AM - 12:00 PM",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.constrainAs(schedule){
                        top.linkTo(timeImage.top)
                        start.linkTo(timeImage.end, 4.dp)
                    }
                )

                Image(
                    painter = painterResource(R.drawable.baseline_dataset_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .constrainAs(dataset){
                            top.linkTo(timeImage.bottom, 16.dp)
                            start.linkTo(timeImage.start)
                    }
                )

                Text(
                    "Data Structures & Algorithms",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.constrainAs(windowTitle){
                        top.linkTo(dataset.top)
                        start.linkTo(dataset.end, margin = 12.dp)
                    }
                )

                Text(
                    "To clear interviews and become good in critical thinking, you need to take this lesson",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(lessonDesc){
                        top.linkTo(windowTitle.bottom, margin = 8.dp)
                        start.linkTo(windowTitle.start)
                    }
                )
            }
        }
    }
}