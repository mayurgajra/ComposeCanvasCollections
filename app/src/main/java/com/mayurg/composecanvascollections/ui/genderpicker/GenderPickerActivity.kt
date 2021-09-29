package com.mayurg.composecanvascollections.ui.genderpicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.mayurg.composecanvascollections.ui.theme.ComposeCanvasCollectionsTheme

class GenderPickerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCanvasCollectionsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    GenderPicker(modifier = Modifier.fillMaxSize()){

                    }
                }
            }
        }
    }
}
