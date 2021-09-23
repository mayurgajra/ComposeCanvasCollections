package com.mayurg.composecanvascollections.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.unit.dp

/**
 * Created On 23/09/2021
 * @author Mayur Gajra
 */
class TransformationAndClippingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val circle = Path().apply {
                    addOval(Rect(center = Offset(400f, 400f), radius = 300f))
                }
                drawPath(
                    path = circle,
                    color = Color.Yellow,
                    style = Stroke(width = 5.dp.toPx())
                )
                clipPath(
                    path = circle
                ) {
                    drawRect(
                        color = Color.Red,
                        topLeft = Offset(400f, 400f),
                        size = Size(400f, 400f)
                    )
                }
            }
        }
    }
}