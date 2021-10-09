package com.mayurg.composecanvascollections.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.mayurg.composecanvascollections.R
import kotlin.math.roundToInt

/**
 * Created On 09/10/2021
 * @author Mayur Gajra
 */
class ImageRevealActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var circlePos by remember {
                mutableStateOf(Offset.Zero)
            }

            var oldCirclePos by remember {
                mutableStateOf(Offset.Zero)
            }
            val imageBmp = ImageBitmap.imageResource(id = R.drawable.kermit)
            val radius = 200f
            Canvas(modifier = Modifier
                .fillMaxSize()
                .pointerInput(true) {
                    detectDragGestures(
                        onDragEnd = {
                            oldCirclePos = circlePos
                        }
                    ) { change, dragAmount ->
                        circlePos = oldCirclePos + change.position
                    }
                }
            ) {
                val bmpHeight =
                    ((imageBmp.height.toFloat() / imageBmp.width.toFloat()) * size.width).roundToInt()
                val circlePath = Path().apply {
                    addArc(
                        oval = Rect(circlePos, radius),
                        startAngleDegrees = 0f,
                        sweepAngleDegrees = 360f
                    )
                }
                drawImage(
                    image = imageBmp,
                    dstSize = IntSize(
                        size.width.roundToInt(),
                        bmpHeight
                    ),
                    dstOffset = IntOffset(0, center.y.roundToInt() - bmpHeight / 2),
                    colorFilter = ColorFilter.tint(Color.Black, BlendMode.Color)
                )
                clipPath(circlePath, clipOp = ClipOp.Intersect) {
                    drawImage(
                        image = imageBmp,
                        dstSize = IntSize(
                            size.width.roundToInt(),
                            bmpHeight
                        ),
                        dstOffset = IntOffset(0, center.y.roundToInt() - bmpHeight / 2),
                    )
                }
            }
        }
    }
}