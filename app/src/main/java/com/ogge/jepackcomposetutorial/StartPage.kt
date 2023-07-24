package com.ogge.jepackcomposetutorial

import android.os.Message
import androidx.compose.foundation.*
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Startpage() {

    println("Starting......")
    println("Launch succeeded!!")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ){
        
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .padding(top = 10.dp)
        ) {
            HeadlineTxt(headline = "MovieBox")

            Icon(
                Icons.Rounded.Person,
                contentDescription = "User Icon",
            modifier = Modifier.size(30.dp),
                tint = colorResource(id = R.color.green2)

                )

        }

        Spacer(modifier = Modifier.padding(20.dp))

        Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)

            ) {
            CategoryText(category = "Bli inspirerad")
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

        Row(modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 10.dp)) {
            Card(elevation = 4.dp, modifier = Modifier
                .size(width = 140.dp, height = 180.dp)
                .padding(horizontal = 4.dp)
               , shape = RoundedCornerShape(10.dp)
            )
            {
                Box(
                    modifier = Modifier

                        .clip(shape = RoundedCornerShape(10.dp)), contentAlignment = Alignment.TopStart
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.rihanna),
                        contentDescription = "Wow",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth()

                    )
                    CardText(title = "Challenge 1")
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .padding(start = 4.dp, bottom = 20.dp)
                    ) {


                        CardTextSecond(title = "Example text")
                    }


                }
            }
            Card(elevation = 4.dp, modifier = Modifier
                .size(width = 140.dp, height = 180.dp)
                .padding(horizontal = 4.dp)
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
                    CardText(title = "Challenge 1")
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .padding(start = 4.dp, bottom = 20.dp)
                    ) {


                        CardTextSecond(title = "Example text")
                    }

                }
            }
            Card(elevation = 4.dp, modifier = Modifier
                .size(width = 140.dp, height = 180.dp)
                .padding(horizontal = 4.dp)
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
                    CardText(title = "Challenge 1")
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .padding(start = 4.dp, bottom = 20.dp)
                    ) {


                        CardTextSecond(title = "Example text")
                    }

                }
            }
            Card(elevation = 4.dp, modifier = Modifier
                .size(width = 140.dp, height = 180.dp)
                .clickable { println("Card pressed!") }
                .padding(horizontal = 4.dp)
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
                    CardText(title = "Challenge 1")
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .padding(start = 4.dp, bottom = 20.dp)
                    ) {


                        CardTextSecond(title = "Example text")
                    }
                }
            }

        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .padding(top = 10.dp)) {
            CategoryText(category = "Högst rankade")

            Icon(
                Icons.Rounded.KeyboardArrowRight
                , contentDescription = "Arrow icon",
            tint = colorResource(id = R.color.green2)
                )
        }
        
        Row(modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 10.dp))  {

               Card(elevation = 4.dp, modifier = Modifier
                   .size(width = 140.dp, height = 200.dp)
                   .padding(horizontal = 4.dp)
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
                               .fillMaxSize()

                       )
                       CardRating(rating = "1")
                       Box(
                           modifier = Modifier
                               .fillMaxWidth()
                               .align(Alignment.BottomCenter)
                               .padding(start = 4.dp, bottom = 20.dp)
                       ) {


                           MovieTitle(title = "Movie 1")
                       }

                   }
               }

        }
        

    }
}

@Composable
fun HeadlineTxt(headline: String){
    Text(text = headline, fontSize = 20.sp, fontWeight = FontWeight.Bold)
}

@Composable
fun CategoryText(category: String){
    Text(text = category, fontSize = 15.sp, color = Color.Gray)
}

@Composable
fun CardText(title: String){
    Text(text = title, fontSize = 15.sp, 
        fontWeight = FontWeight.Bold, 
        color = Color.White, 
    modifier = Modifier
        .padding(top = 5.dp)
        .padding(horizontal = 5.dp)
        )
}

@Composable
fun CardTextSecond(title: String){
    Text(text = title, fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier
            .padding(horizontal = 5.dp)
    )
}

@Composable
fun CardRating(rating: String) {
    Text(text = rating, fontSize = 28.sp,
    fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier
            .padding(top = 5.dp)
            .padding(horizontal = 5.dp)
        )
}

@Composable
fun MovieTitle(title: String){
   Text(text = title, fontSize = 20.sp,
   fontWeight = FontWeight.Bold,
       color = Color.White,
       modifier = Modifier
           .padding(horizontal = 5.dp)
   )
    
}


