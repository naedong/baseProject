package kr.io.sampling.ui.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * sampling
 * Created by Naedong
 * Date: 2024-03-14(014)
 * Time: 오후 11:05
 */

private val darkColorScheme = CustomColorScheme(
    background = Color.Black,
    onBackground = Color.Transparent,
    primary = darkPrimary,
    onPrimary = onPrimary,
    secondary = darkSecondary,
    onSecondary = onSecondary,
    tertiary = tertiary,
    onTertiary = onTertiary
)

private val lightColorScheme = CustomColorScheme(
    background = Color.White,
    onBackground = Color.Transparent,
    primary = primary,
    onPrimary = onPrimary,
    secondary = secondary,
    onSecondary = onSecondary,
    tertiary = tertiary,
    onTertiary = onTertiary
)

private val typography = CustomTypography(
    headTitle = TextStyle(
        fontFamily = bukkGodicBold,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),


    subHeadTitle = TextStyle(
        fontFamily = bukkGodicRagulr,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    bodyTitle = TextStyle(
        fontFamily = bukkGodicBold,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    subBodyTitle = TextStyle(
        fontFamily = bukkGodicRagulr,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = bukkLightBold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = bukkLightRagular,
        fontSize = 14.sp
    ),
)

private val shape = CustomShape(
    container = RoundedCornerShape(12.dp),
    button = RoundedCornerShape(50),
    circular = CircleShape,
    card = RoundedCornerShape(24.dp)
)

private val size = AppSize(
    large = 24.dp,
    medium = 16.dp,
    normal = 12.dp,
    small = 8.dp
)

@Composable
fun CustomAppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkTheme) darkColorScheme else lightColorScheme
    val rippleIndication = rememberRipple()
    CompositionLocalProvider(
        LocalCustomColorScheme provides colorScheme,
        LocalAppTypography provides typography,
        LocalAppShape provides shape,
        LocalAppSize provides size,
        LocalIndication provides rippleIndication,
        content = content
    )
}

object AppTheme {

    val colorScheme: CustomColorScheme
        @Composable get() = LocalCustomColorScheme.current

    val typography: CustomTypography
        @Composable get() = LocalAppTypography.current

    val shape: CustomShape
        @Composable get() = LocalAppShape.current

    val size: AppSize
        @Composable get() = LocalAppSize.current
}