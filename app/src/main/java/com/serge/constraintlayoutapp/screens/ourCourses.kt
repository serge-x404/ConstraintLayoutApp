package com.serge.constraintlayoutapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.serge.constraintlayoutapp.R

@Composable
fun TextOurCourses(modifier: Modifier) {
    Text(
        "New Courses",
        modifier = modifier,
        fontSize = 20.sp,
        color = Color.Black,
        fontWeight = FontWeight.Bold
    )
}



@Composable
fun AndroidCourseImage(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,
        modifier = modifier
            .size(80.dp)
    )
}


@Composable
fun JavaCourseImage(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,
        modifier = modifier
            .size(80.dp)
    )
}


@Composable
fun PythonCourseImage(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = null,
        modifier = modifier
            .size(80.dp)
    )
}


@Composable
fun AndroidText(modifier: Modifier) {
    Text(
        "Android",
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = modifier
    )
}

@Composable
fun JavaText(modifier: Modifier) {
    Text(
        "Java",
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = modifier
    )
}

@Composable
fun PythonText(modifier: Modifier) {
    Text(
        "Python",
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = modifier
    )
}