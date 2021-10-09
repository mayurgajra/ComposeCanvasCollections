package com.mayurg.composecanvascollections.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.mayurg.composecanvascollections.R
import com.mayurg.composecanvascollections.ui.theme.ComposeCanvasCollectionsTheme

class ImageFilterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val kermit = ImageBitmap.imageResource(id = R.drawable.kermit)
            ComposeCanvasCollectionsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        drawImage(
                            image = kermit,
                            dstOffset = IntOffset(100, 100),
                            dstSize = IntSize(
                                (400 * (kermit.width.toFloat() / kermit.height)).toInt(),
                                400,
                            )
                        )
                        drawCircle(
                            color = Color.Black,
                            radius = 200f,
                            center = Offset(300f, 300f),
                            blendMode = BlendMode.Color
                        )
                    }
                }
            }
        }
    }
}

