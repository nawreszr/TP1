package com.example.mycolors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.tp1.ui.theme.TP1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TP1Theme {
                // Call the UI design function
                ThreeColorLayout()
                FourColorLayout()
            }
        }
    }
}

@Composable
fun ThreeColorLayout() {
    // Parent Column for layout arrangement
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Top red block, occupies half of the screen
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)  // Take 50% of the height
                .background(Color.Red)
        )

        // Bottom part with two blocks (blue and green)
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)  // Take the remaining 50% of the height
        ) {
            // Left blue block
            Box(
                modifier = Modifier
                    .weight(1f)  // Take 50% of the width
                    .fillMaxHeight()
                    .background(Color.Blue)
            )

            // Right green block
            Box(
                modifier = Modifier
                    .weight(1f)  // Take 50% of the width
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }
    }
}
@Composable
fun FourColorLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Top row: Blue (left) and Green (right)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)  // Take 50% of the height
        ) {
            // Left blue block
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue)
            )

            // Right green block
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }

        // Bottom row: Red (left) and Yellow (right)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)  // Take 50% of the height
        ) {
            // Left red block
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
            )


            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
            )}}}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TP1Theme {
        ThreeColorLayout()
    }
}

@Preview(showBackground = true)
@Composable
fun FourColorPreview() {
    TP1Theme {
        FourColorLayout()
    }
}