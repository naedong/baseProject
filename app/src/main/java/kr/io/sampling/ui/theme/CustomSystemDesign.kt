package kr.io.sampling.ui.theme


import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.unit.Dp

/**
 * sampling
 * Created by Naedong
 * Date: 2024-03-14(014)
 * Time: 오후 10:32
 */

@Stable
data class CustomColorScheme(
    val background : Color,
    val onBackground : Color,
    val primary : Color,
    val onPrimary : Color,
    val secondary : Color,
    val onSecondary : Color,
    val tertiary : Color,
    val onTertiary : Color
) {
    val primaryHorizontalGradient : Brush = Brush.horizontalGradient(listOf(primary, secondary))
}

@Stable
data class CustomTypography(
    val headTitle : TextStyle,
    val subHeadTitle : TextStyle,
    val bodyTitle : TextStyle,
    val subBodyTitle : TextStyle,
    val body1 : TextStyle,
    val body2 : TextStyle,
)

@Stable
data class CustomShape(
    val container: Shape,
    val button: Shape,
    val circular: Shape,
    val card : Shape,
)

@Stable
data class AppSize(
    val large: Dp,
    val medium: Dp,
    val normal: Dp,
    val small: Dp
)

val LocalCustomColorScheme = staticCompositionLocalOf {
    CustomColorScheme(
        background = Color.Unspecified,
        onBackground = Color.Unspecified,
        primary = Color.Unspecified,
        onPrimary = Color.Unspecified,
        secondary = Color.Unspecified,
        onSecondary = Color.Unspecified,
        tertiary = Color.Unspecified,
        onTertiary = Color.Unspecified,
    )
}


val LocalAppTypography = staticCompositionLocalOf {
    CustomTypography(
        headTitle = TextStyle.Default,
        subHeadTitle = TextStyle.Default,
        bodyTitle = TextStyle.Default,
        subBodyTitle = TextStyle.Default,
        body1 = TextStyle.Default,
        body2 = TextStyle.Default
    )
}

val LocalAppShape = staticCompositionLocalOf {
    CustomShape(
        container = RectangleShape,
        button = RectangleShape,
        circular = CircleShape,
        card = RectangleShape
    )
}

val LocalAppSize = staticCompositionLocalOf {
    AppSize(
        large = Dp.Unspecified,
        medium = Dp.Unspecified,
        normal = Dp.Unspecified,
        small = Dp.Unspecified
    )
}