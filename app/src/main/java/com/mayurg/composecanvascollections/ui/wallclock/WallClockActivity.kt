package com.mayurg.composecanvascollections.ui.wallclock

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mayurg.composecanvascollections.ui.theme.ComposeCanvasCollectionsTheme
import kotlinx.coroutines.delay

/**
 * Created On 12/09/2021
 * @author Mayur Gajra
 */
class WallClockActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCanvasCollectionsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center,
                    ) {
                        val milliseconds = remember {
                            System.currentTimeMillis()
                        }
                        var seconds by remember {
                            mutableStateOf((milliseconds / 1000f) % 60f)
                        }
                        var minutes by remember {
                            mutableStateOf(((milliseconds / 1000f) / 60) % 60f)
                        }
                        var hours by remember {
                            mutableStateOf((milliseconds / 1000f) / 3600f)
                        }
                        LaunchedEffect(key1 = seconds) {
                            delay(1000L)
                            minutes += 1f / 60f
                            hours += 1f / (60f * 12f)
                            seconds += 1f
                        }
                        Clock(
                            seconds = seconds,
                            minutes = minutes,
                            hours = hours
                        )
                    }

                }

            }
        }
    }
}