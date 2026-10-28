package com.example.article.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    background = Color(0xFF1E1005),
    surface = Color(0xFF1E1005),
    onBackground = Color(0xFFF5DFD4),
    onSurface = Color(0xFFF5DFD4)
)

private val LightColorScheme = lightColorScheme(
    background = Color(0xFFFFF5EC),
    surface = Color(0xFFFFF5EC),
    onBackground = Color(0xFF231910),
    onSurface = Color(0xFF231910)
)

@Composable
fun ArticleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}