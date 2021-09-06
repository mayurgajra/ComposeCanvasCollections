package com.mayurg.composecanvascollections.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.mayurg.composecanvascollections.ui.theme.ComposeCanvasCollectionsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCanvasCollectionsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ButtonsContainer()
                }
            }
        }
    }

    @Composable
    fun ButtonsContainer() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(
                onClick = {
                    openBasicShapeActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Basic shapes",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }
        }
    }

    private fun openBasicShapeActivity() {
        val intent = Intent(this, BasicShapesActivity::class.java)
        startActivity(intent)
    }

}




