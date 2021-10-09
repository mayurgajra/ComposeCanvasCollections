package com.mayurg.composecanvascollections.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.mayurg.composecanvascollections.ui.genderpicker.GenderPickerActivity
import com.mayurg.composecanvascollections.ui.theme.ComposeCanvasCollectionsTheme
import com.mayurg.composecanvascollections.ui.tictactoe.TicTacToeActivity
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
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(scrollState),
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

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openPathsBasicActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Paths Basics",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openPathsOpsActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Paths Operations",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openAnimatedPathsLineActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Animated path line",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openAnimatedPathsArrowActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Animated path arrow",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openTransformationAndClippingActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Transformation & clipping",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openPathEffectsActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Path Effects",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openTextOnPathActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Text On Path",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openGenderPickerActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Gender Picker",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openTicTacToeActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Tic-Tac-Toe",
                    modifier = Modifier.wrapContentSize(),
                    style = TextStyle(MaterialTheme.colors.onPrimary)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    openImageFilterActivity()
                },
                modifier = Modifier.background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Image Filter",
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

    private fun openPathsBasicActivity() {
        val intent = Intent(this, PathsBasicActivity::class.java)
        startActivity(intent)
    }

    private fun openPathsOpsActivity() {
        val intent = Intent(this, PathOperationsActivity::class.java)
        startActivity(intent)
    }

    private fun openAnimatedPathsLineActivity() {
        val intent = Intent(this, PathLineAnimationActivity::class.java)
        startActivity(intent)
    }

    private fun openAnimatedPathsArrowActivity() {
        val intent = Intent(this, PathArrowAnimationActivity::class.java)
        startActivity(intent)
    }

    private fun openTransformationAndClippingActivity() {
        val intent = Intent(this, TransformationAndClippingActivity::class.java)
        startActivity(intent)
    }

    private fun openPathEffectsActivity() {
        val intent = Intent(this, PathEffectsActivity::class.java)
        startActivity(intent)
    }

    private fun openTextOnPathActivity() {
        val intent = Intent(this, TextOnPathActivity::class.java)
        startActivity(intent)
    }

    private fun openGenderPickerActivity() {
        val intent = Intent(this, GenderPickerActivity::class.java)
        startActivity(intent)
    }

    private fun openTicTacToeActivity() {
        val intent = Intent(this, TicTacToeActivity::class.java)
        startActivity(intent)
    }

    private fun openImageFilterActivity() {
        val intent = Intent(this, ImageFilterActivity::class.java)
        startActivity(intent)
    }

}




