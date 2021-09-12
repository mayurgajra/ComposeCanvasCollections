package com.mayurg.composecanvascollections.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.mayurg.composecanvascollections.ui.theme.ComposeCanvasCollectionsTheme
import com.mayurg.composecanvascollections.ui.wallclock.WallClockActivity
import com.mayurg.composecanvascollections.ui.weightpicker.WeightPickerActivity

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
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openBallClickerGameActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Ball clicker",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openDrawTextActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Draw Text",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openWeightPickerActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Weight Picker",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openWallClockActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Wall clock",
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

    private fun openBallClickerGameActivity() {
        val intent = Intent(this, BallClickerGame::class.java)
        startActivity(intent)
    }

    private fun openDrawTextActivity() {
        val intent = Intent(this, DrawTextActivity::class.java)
        startActivity(intent)
    }

    private fun openWeightPickerActivity() {
        val intent = Intent(this, WeightPickerActivity::class.java)
        startActivity(intent)
    }

    private fun openWallClockActivity() {
        val intent = Intent(this, WallClockActivity::class.java)
        startActivity(intent)
    }

}




