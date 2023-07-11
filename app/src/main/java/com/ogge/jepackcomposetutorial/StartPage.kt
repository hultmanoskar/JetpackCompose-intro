package com.ogge.jepackcomposetutorial

import android.os.Message
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Startpage() {

    println("Starting......")
    println("Launch succeeded!!")

    Column(
        modifier = Modifier.fillMaxSize()
    ){
        
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .padding(top = 10.dp)
        ) {
            headlineTxt(headline = "Träna Ute")

            Icon(
                Icons.Rounded.Person,
                contentDescription = "User Icon",
            modifier = Modifier.size(30.dp),
                tint = colorResource(id = R.color.green2)

                )

        }
        

        Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)

            ) {
            categoryText(category = "Bli inspirerad")
            Icon(
                Icons.Rounded.KeyboardArrowRight,
                contentDescription = stringResource(id = androidx.compose.ui.R.string.close_drawer),
                modifier = Modifier, tint = colorResource(id = R.color.green2)
            )
        }
        /*Row() {
            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .height(160.dp)
                    .width(140.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(10.dp))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rihanna),
                        contentDescription = "Wow",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxHeight()
                    )
                }
            }
        }*/
        Spacer(modifier = Modifier.padding(20.dp))
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            Card(elevation = 4.dp, modifier = Modifier
               , shape = RoundedCornerShape(10.dp)
            )
            {
                Box(
                    modifier = Modifier

                        .clip(shape = RoundedCornerShape(10.dp))
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.rihanna),
                        contentDescription = "Wow",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                    )
                    //Text(text = "Headline", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.Red)

                }
            }
            Card(elevation = 4.dp, modifier = Modifier
               , shape = RoundedCornerShape(10.dp)
            )
            {
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(10.dp))
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.rihanna),
                        contentDescription = "Wow",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                    )
                    //Text(text = "Headline", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.Red)

                }
            }
            Card(elevation = 4.dp, modifier = Modifier
                , shape = RoundedCornerShape(10.dp)
            )
            {
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(10.dp))
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.rihanna),
                        contentDescription = "Wow",
                        contentScale = ContentScale.Crop,
                        //modifier = Modifier.fillMaxHeight()
                    )
                    //Text(text = "Headline", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.Red)
                }
            }

        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .padding(top = 10.dp)) {
            categoryText(category = "Högst rankade")

            Icon(
                Icons.Rounded.KeyboardArrowRight
                , contentDescription = "Arrow icon",
            tint = colorResource(id = R.color.green2)
                )
        }

    }
}

@Composable
fun headlineTxt(headline: String){
    Text(text = headline, fontSize = 20.sp, fontWeight = FontWeight.Bold)
}

@Composable
fun categoryText(category: String){
    Text(text = category, fontSize = 15.sp, color = Color.Gray)
}
