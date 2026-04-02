package com.example.pocketresep4.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val PocketResepColorScheme = lightColorScheme(
    primary = PinkPrimary,
    secondary = PinkSecondary,
    background = BackgroundLight,
    surface = SurfaceWhite,
    onPrimary = OnPrimaryText
)

@Composable
fun PocketResepTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = PocketResepColorScheme,
        typography = AppTypography,
        content = content
    )
}