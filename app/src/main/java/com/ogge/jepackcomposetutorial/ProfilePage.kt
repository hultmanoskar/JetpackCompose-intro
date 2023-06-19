package com.ogge.jepackcomposetutorial

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

@Composable
fun ProfilePage() {
    Card(elevation = 4.dp, modifier = Modifier
        .fillMaxSize()
        .padding(top = 100.dp, bottom = 100.dp, start = 14.dp, end = 14.dp)
        .border(width = 2.dp, color = Color.Gray)) {

        BoxWithConstraints() {
            val constraints = if (minWidth < 600.dp) {
                portraitConstrains(margin = 14.dp)
            } else {
                // TODO landscape constraints
                 //portraitConstrains(margin = 14.dp)
                landscapeConstraints(margin = 10.dp)
            }

            ConstraintLayout(constraints) {


                Image(
                    painter = painterResource(id = R.drawable.rihanna),
                    contentDescription = "Example image",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(
                            width = 2.dp,
                            color = Color.Green,
                            shape = CircleShape
                        ).layoutId("image"),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Rihanna",
                    color = Color.Green,
                    fontSize = 20.sp,
                    modifier = Modifier.layoutId("nameText")
                )
                Text(
                    text = "Challenge text",
                    fontSize = 14.sp,
                    modifier = Modifier.layoutId("challengeTxt")
                )


                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .layoutId("rowStats")

                ) {
                    ProfileStats(count = "150", title = "Followers")
                    ProfileStats(count = "100", title = "Following")
                    ProfileStats(count = "30", title = "Posts")
                }

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.layoutId("buttonFirst")

                ) {
                    Text(text = "Follow user")
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.layoutId("buttonSecond")

                ) {
                    Text(text = "Direct message")
                }
            }
        }
        }
    }

@Composable
fun ProfileStats(count: String, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = title)
    }
}

private fun portraitConstrains(margin: Dp): ConstraintSet {
    return ConstraintSet {

        val image = createRefFor("image")
        val nameText = createRefFor("nameText")
        val challengeTxt = createRefFor("challengeTxt")
        val rowStats = createRefFor("rowStats")
        val buttonFirst = createRefFor("buttonFirst")
        val buttonSecond = createRefFor("buttonSecond")

        constrain(image){
            top.linkTo(parent.top, margin = 10.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
        constrain(nameText){
            top.linkTo(image.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
        constrain(challengeTxt){
            top.linkTo(nameText.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
        constrain(rowStats){
            top.linkTo(challengeTxt.bottom)
        }
        constrain(buttonFirst){
            top.linkTo(rowStats.bottom, margin = margin)
            start.linkTo(parent.start)
            end.linkTo(buttonSecond.start)
            width = Dimension.wrapContent
        }
        constrain(buttonSecond){
            top.linkTo(rowStats.bottom, margin = margin)
            start.linkTo(buttonFirst.end)
            end.linkTo(parent.end)
            width = Dimension.wrapContent
        }
    }
}

private fun landscapeConstraints(margin: Dp): ConstraintSet{
    return ConstraintSet {

        val image = createRefFor("image")
        val nameText = createRefFor("nameText")
        val challengeTxt = createRefFor("challengeTxt")
        val rowStats = createRefFor("rowStats")
        val buttonFirst = createRefFor("buttonFirst")
        val buttonSecond = createRefFor("buttonSecond")

        constrain(image){
            top.linkTo(parent.top, margin = margin)
            start.linkTo(parent.start, margin = margin)
        }
        constrain(nameText){
            start.linkTo(image.start)
            top.linkTo(image.bottom)

        }
        constrain(challengeTxt){
            top.linkTo(nameText.bottom)
            start.linkTo(nameText.start, margin = 10.dp)
            end.linkTo(nameText.end)
        }
        constrain(rowStats){
            top.linkTo(image.top)
            end.linkTo(parent.end)
            start.linkTo(image.end, margin = margin)
        }
        constrain(buttonFirst){
            top.linkTo(rowStats.bottom, margin = 4.dp)
            start.linkTo(rowStats.start)
            end.linkTo(buttonSecond.end)
            bottom.linkTo(challengeTxt.bottom)
            width = Dimension.wrapContent
        }
        constrain(buttonSecond){
            top.linkTo(rowStats.bottom, margin = 4.dp)
            start.linkTo(buttonFirst.end)
            end.linkTo(parent.end)
            bottom.linkTo(challengeTxt.bottom)
            width = Dimension.wrapContent
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview() {
    ProfilePage()
}