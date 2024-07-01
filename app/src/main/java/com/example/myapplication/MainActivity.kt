package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
                GreetingText(message = "You are the best person", "Olivia", "Vincent")
                }
            }
        }
    }


@Composable
fun GreetingText(message : String, from : String, to : String, modifier : Modifier = Modifier) {
Column(modifier = modifier){
    Text (
        text = "From " + from,
        fontSize = 26.sp,
        )
    Text (
        text = message,
        fontSize = 60.sp,
        lineHeight = 80.sp
    )
    Text (
        text = "To " + to,
        fontSize = 30.sp,
        lineHeight = 50.sp
    )
}

}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    MyApplicationTheme {
        GreetingText(message = "You are the best person", "Olivia", "Vincent")
    }
}




