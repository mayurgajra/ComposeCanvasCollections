package com.mayurg.composecanvascollections.ui

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.nativeCanvas

/**
 * Created On 27/09/2021
 * @author Mayur Gajra
 */
class TextOnPathActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val path = Path().apply {
                moveTo(200f, 800f)
                quadTo(600f, 400f, 1000f, 800f)
            }
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawContext.canvas.nativeCanvas.apply {
                    drawTextOnPath(
                        "Hello Mayur",
                        path,
                        30f,
                        50f,
                        Paint().apply {
                            color = Color.RED
                            textSize = 80f
                            textAlign = Paint.Align.CENTER
                        }
                    )
                }
            }
        }
    }
}