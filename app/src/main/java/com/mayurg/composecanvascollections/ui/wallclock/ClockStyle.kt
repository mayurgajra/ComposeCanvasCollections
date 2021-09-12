package com.mayurg.composecanvascollections.ui.wallclock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Created On 12/09/2021
 * @author Mayur Gajra
 */
data class ClockStyle(
    val radius: Dp = 120.dp,
    val normalLineColor: Color = Color.LightGray,
    val fiveStepLineColor: Color = Color.Cyan,
    val normalLineLength: Dp = 15.dp,
    val fiveStepLength: Dp = 25.dp,
)
