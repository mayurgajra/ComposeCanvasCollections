package com.mayurg.composecanvascollections.ui

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.nativeCanvas

/**
 * Created On 09/09/2021
 * @author Mayur Gajra
 */
class DrawTextActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Canvas(modifier = Modifier.fillMaxSize()){
                drawContext.canvas.nativeCanvas.apply {
                    drawText(
                        "Normal Text",
                        100f,
                        100f,
                        Paint().apply {
                            color = Color.RED
                            textSize = 100f

                        }
                    )
                }
            }
        }
    }
}