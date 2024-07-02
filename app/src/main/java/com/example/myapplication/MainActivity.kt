package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                BirthdayImage(
                    message = "You are the best person", "Olivia", "Vincent", modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp))
                }
            }
        }
    }


@Composable
fun GreetingText(message : String, from : String, to : String, modifier : Modifier = Modifier) {
Column(modifier = modifier.padding(8.dp),
    verticalArrangement = Arrangement.Center){
    Text (
        text = "From " + from,
        fontSize = 36.sp,
        modifier = Modifier
            .padding(16.dp)
        )
    Text (
        text = message,
        fontSize = 60.sp,
        lineHeight = 80.sp,
        textAlign = TextAlign.Center
    )
    Text (
        text = "To " + to,
        fontSize = 30.sp,
        lineHeight = 50.sp,
        textAlign = TextAlign.Center

    )
}

}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    MyApplicationTheme {
      //  GreetingText(message = "You are the best person", "Olivia", "Vincent")
        BirthdayImage(
            message = "You are the best person", "Olivia", "Vincent", modifier = Modifier
                .fillMaxSize()
                .padding(8.dp))
    }
}

@Composable
fun BirthdayImage(message : String, from : String, to : String, modifier : Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box (modifier) {
        Image (
            painter = image,
            contentDescription = null
        )
        GreetingText(message = "You are the best person", "Olivia", "Vincent", modifier = Modifier
            .fillMaxSize()
            .padding(8.dp))
    }
}



