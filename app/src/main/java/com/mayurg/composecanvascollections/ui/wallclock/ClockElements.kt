package com.mayurg.composecanvascollections.ui.wallclock

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mayurg.composecanvascollections.ui.weightpicker.LineType
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

/**
 * Created On 12/09/2021
 * @author Mayur Gajra
 */

@Composable
fun Clock(
    seconds: Float,
    minutes: Float,
    hours: Float,
    style: ClockStyle = ClockStyle()
) {

    val radius: Dp = style.radius

    Canvas(modifier = Modifier.fillMaxSize()) {
        val outerRadius = radius.toPx() + style.fiveStepLength.toPx()
        for (i in 0..360 step 6) {
            val angleInRad = i * (PI / 180f).toFloat()
            val lineType = when {
                i % 5 == 0 -> LineType.FiveStep
                else -> LineType.Normal
            }
            val lineLength = when (lineType) {
                LineType.FiveStep -> style.fiveStepLength.toPx()
                else -> style.normalLineLength.toPx()
            }

            val lineColor = when (lineType) {
                LineType.FiveStep -> style.fiveStepLineColor
                else -> style.normalLineColor
            }

            val lineStart = Offset(
                x = (outerRadius - lineLength) * cos(angleInRad) + center.x,
                y = (outerRadius - lineLength) * sin(angleInRad) + center.y
            )

            val lineEnd = Offset(
                x = outerRadius * cos(angleInRad) + center.x,
                y = outerRadius * sin(angleInRad) + center.y
            )

            drawLine(
                color = lineColor,
                start = lineStart,
                end = lineEnd,
                strokeWidth = 1.dp.toPx()
            )

        }

        drawCircle(Color.DarkGray,10f,center = center)

        //second line
        val angleForSecondsLineInRad = seconds * (PI / 180f).toFloat() * 6f
        val innerRadiusForSecond = radius.toPx()
        val secondLineStart = Offset(
            x = center.x,
            y = center.y
        )
        val secondLineEnd = Offset(
            x = innerRadiusForSecond * cos(angleForSecondsLineInRad) + center.x,
            y = innerRadiusForSecond * sin(angleForSecondsLineInRad) + center.y
        )
        drawLine(
            color = Color.Red,
            start = secondLineStart,
            end = secondLineEnd,
            strokeWidth = 2.dp.toPx()
        )

        //minute line
        val angleForMinutesInRad = minutes * (PI / 180f).toFloat() * 6f

        val innerRadiusForMinute = radius.toPx()
        val minutesLineStart = Offset(
            x = center.x,
            y = center.y
        )
        val minutesLineEnd = Offset(
            x = innerRadiusForMinute * cos(angleForMinutesInRad) + center.x,
            y = innerRadiusForMinute * sin(angleForMinutesInRad) + center.y
        )

        drawLine(
            color = Color.Black,
            start = minutesLineStart,
            end = minutesLineEnd,
            strokeWidth = 3.dp.toPx()
        )

        //hour line
        val angleForHourInRad = hours * (PI / 180f).toFloat() * 30f

        val innerRadiusForHour = radius.toPx()
        val hoursLineStart = Offset(
            x = center.x,
            y = center.y
        )
        val hoursLineEnd = Offset(
            x = innerRadiusForHour * cos(angleForHourInRad) + center.x,
            y = innerRadiusForHour * sin(angleForHourInRad) + center.y
        )

        drawLine(
            color = Color.Black,
            start = hoursLineStart,
            end = hoursLineEnd,
            strokeWidth = 4.dp.toPx()
        )
    }

}