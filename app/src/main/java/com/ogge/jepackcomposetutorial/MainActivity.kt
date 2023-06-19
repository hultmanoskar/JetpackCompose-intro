package com.ogge.jepackcomposetutorial

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ogge.jepackcomposetutorial.ui.theme.JepackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JepackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting(name = "")
                    ProfilePage()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    var nameState by remember {
        mutableStateOf("")
    }

    var name by rememberSaveable {
        mutableStateOf("")
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text(text = "Hello! $name")
        Spacer(modifier = Modifier.height(10.dp))
        TextField(value = nameState , onValueChange = {
            nameState = it
        })
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            name = nameState
        }) {
            Text(text = "Display")
        }
    }
}

@Composable
fun myFunc() {
    Text(text = "My function!",
    fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue
        )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   myFunc()
}