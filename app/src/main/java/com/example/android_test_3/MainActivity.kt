package com.example.android_test_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_test_3.ui.theme.Android_Test_3Theme
import android.support.v4.os.IResultReceiver.Default as Default1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quadrant()
        }
    }
}

@Composable
fun Quadrant() {
    Row() {
        Column() {
            Box(
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .fillMaxSize(0.5f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Text composable",
                        style = TextStyle(fontWeight = FontWeight.Bold),
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontSize = 15.sp
                    )
                    Text(
                        text = "Displays text and follows the recommended Material Design guidelines.",
                        textAlign = TextAlign.Justify, fontSize = 16.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
                    .background(Color(0xFFB69DF8))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Row composable", style = TextStyle(fontWeight = FontWeight.Bold),
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontSize = 15.sp
                    )
                    Text(
                        text = "A layout composable that places its children in a horizontal sequence.",
                        textAlign = TextAlign.Justify, fontSize = 16.sp
                    )
                }

            }
        }
        Column() {
            Box(
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .fillMaxHeight(0.5f)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Image composable",
                        style = TextStyle(fontWeight = FontWeight.Bold),
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontSize = 15.sp
                    )
                    Text(text = "Creates a composable that lays out and draws a given Painter class object.",
                        textAlign = TextAlign.Justify, fontSize = 16.sp
                        )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF6EDFF))
            ) {
                Column(
                    modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Column composable",
                        style = TextStyle(fontWeight = FontWeight.Bold),
                        modifier = Modifier.padding(bottom = 16.dp),
                        fontSize = 15.sp
                    )
                    Text(
                        text = "A layout composable that places its children in a vertical sequence.",
                        textAlign = TextAlign.Justify, fontSize = 16.sp
                    )
                }
            }
        }
    }
}
