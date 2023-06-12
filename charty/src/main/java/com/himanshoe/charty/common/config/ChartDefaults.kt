package com.himanshoe.charty.common.config

import androidx.compose.ui.graphics.Color

object ChartDefaults {

    fun axisConfigDefaults() = AxisConfig(
        showGridLabel = true,
        showAxes = true,
        showGridLines = true,
        axisStroke = 2F,
        axisColor = Color.Black,
        minLabelCount = 2
    )
    fun noAxisDefault() = AxisConfig(
        showGridLabel = false,
        showAxes = false,
        showGridLines = false,
        axisStroke = 0F,
        axisColor = Color.Transparent,
        minLabelCount = Int.MIN_VALUE
    )

    fun colorDefaults() = ChartColors(
        contentColor = listOf(
            Color(0xffed625d),
            Color(0xfff79f88)
        ),
        backgroundColors = listOf(
            Color.Transparent, Color.Transparent
        )
    )
}
