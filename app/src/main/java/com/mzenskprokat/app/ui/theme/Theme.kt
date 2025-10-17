package com.mzenskprokat.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Цветовая палитра для светлой темы
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF1976D2),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFBBDEFB),
    onPrimaryContainer = Color(0xFF0D47A1),

    secondary = Color(0xFFFF6F00),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFFFE0B2),
    onSecondaryContainer = Color(0xFFE65100),

    tertiary = Color(0xFF388E3C),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFC8E6C9),
    onTertiaryContainer = Color(0xFF1B5E20),

    background = Color(0xFFFAFAFA),
    onBackground = Color(0xFF212121),

    surface = Color.White,
    onSurface = Color(0xFF212121),
    surfaceVariant = Color(0xFFF5F5F5),
    onSurfaceVariant = Color(0xFF616161),

    error = Color(0xFFD32F2F),
    onError = Color.White,
    errorContainer = Color(0xFFFFCDD2),
    onErrorContainer = Color(0xFFB71C1C),

    outline = Color(0xFFBDBDBD),
    outlineVariant = Color(0xFFE0E0E0)
)

// Цветовая палитра для темной темы
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF42A5F5),
    onPrimary = Color(0xFF0D47A1),
    primaryContainer = Color(0xFF1565C0),
    onPrimaryContainer = Color(0xFFBBDEFB),

    secondary = Color(0xFFFFB74D),
    onSecondary = Color(0xFFE65100),
    secondaryContainer = Color(0xFFFF8F00),
    onSecondaryContainer = Color(0xFFFFE0B2),

    tertiary = Color(0xFF66BB6A),
    onTertiary = Color(0xFF1B5E20),
    tertiaryContainer = Color(0xFF2E7D32),
    onTertiaryContainer = Color(0xFFC8E6C9),

    background = Color(0xFF121212),
    onBackground = Color(0xFFE0E0E0),

    surface = Color(0xFF1E1E1E),
    onSurface = Color(0xFFE0E0E0),
    surfaceVariant = Color(0xFF2C2C2C),
    onSurfaceVariant = Color(0xFFBDBDBD),

    error = Color(0xFFEF5350),
    onError = Color(0xFFB71C1C),
    errorContainer = Color(0xFFC62828),
    onErrorContainer = Color(0xFFFFCDD2),

    outline = Color(0xFF616161),
    outlineVariant = Color(0xFF424242)
)

@Composable
fun MzenskProkatTheme(
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

// Типография
private val Typography = Typography(
    displayLarge = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(57),
        lineHeight = androidx.compose.ui.unit.sp(64),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    displayMedium = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(45),
        lineHeight = androidx.compose.ui.unit.sp(52),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    displaySmall = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(36),
        lineHeight = androidx.compose.ui.unit.sp(44),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    headlineLarge = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(32),
        lineHeight = androidx.compose.ui.unit.sp(40),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    headlineMedium = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(28),
        lineHeight = androidx.compose.ui.unit.sp(36),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    headlineSmall = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(24),
        lineHeight = androidx.compose.ui.unit.sp(32),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    titleLarge = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(22),
        lineHeight = androidx.compose.ui.unit.sp(28),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    titleMedium = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(16),
        lineHeight = androidx.compose.ui.unit.sp(24),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium
    ),
    titleSmall = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(14),
        lineHeight = androidx.compose.ui.unit.sp(20),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium
    ),
    bodyLarge = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(16),
        lineHeight = androidx.compose.ui.unit.sp(24),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    bodyMedium = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(14),
        lineHeight = androidx.compose.ui.unit.sp(20),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    bodySmall = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(12),
        lineHeight = androidx.compose.ui.unit.sp(16),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
    ),
    labelLarge = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(14),
        lineHeight = androidx.compose.ui.unit.sp(20),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium
    ),
    labelMedium = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(12),
        lineHeight = androidx.compose.ui.unit.sp(16),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium
    ),
    labelSmall = androidx.compose.ui.text.TextStyle(
        fontSize = androidx.compose.ui.unit.sp(11),
        lineHeight = androidx.compose.ui.unit.sp(16),
        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium
    )
)