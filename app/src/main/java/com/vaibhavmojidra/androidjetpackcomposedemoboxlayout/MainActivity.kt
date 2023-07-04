package com.vaibhavmojidra.androidjetpackcomposedemoboxlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.vaibhavmojidra.androidjetpackcomposedemoboxlayout.ui.theme.AndroidJetpackComposeDemoBoxLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeDemoBoxLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MultipleBoxLayoutExample()
                }
            }
        }
    }
}

@Composable
fun MultipleBoxLayoutExample() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxSize(0.5f)
        ) {
            Text(
                text = "Box 1",
                color = Color.White
            )
        }
        Box(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxSize(0.3f)
                .align(Alignment.Center)
        ) {
            Text(
                text = "Box 2",
                color = Color.White
            )
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxSize(0.2f)
                .align(Alignment.BottomEnd)
        ) {
            Text(
                text = "Box 3",
                color = Color.White
            )
        }
    }
}



