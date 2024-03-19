package kr.io.sampling.presentation.view.main

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import kr.io.sampling.presentation.model.MainViewModel
import kr.io.sampling.ui.theme.AppTheme
import kr.io.sampling.ui.theme.CustomAppTheme

/**
 * sampling
 * Created by Naedong
 * Date: 2024-03-14(014)
 * Time: 오후 11:59
 */


@Composable
fun MainPage(

) {
    val mainViewModel = hiltViewModel<MainViewModel>()
    val isDarkTheme = mainViewModel.isDarkTheme.collectAsState()
    CustomAppTheme(
        isDarkTheme = isDarkTheme.value
    ) {
        Scaffold(
            containerColor = AppTheme.colorScheme.primary
        ) {
           Text(text = "it $it")
            Column(
                Modifier
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                AppTheme.colorScheme.primary,
                                AppTheme.colorScheme.secondary
                            )
                        ),
                        RoundedCornerShape(10.dp)
                    )
                    .fillMaxSize()
            ){

            }
            LazyColumn(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                item {
                    Button(onClick = { mainViewModel.settingTheme() }, colors = ButtonColors(
                        containerColor = AppTheme.colorScheme.background,
                        contentColor = AppTheme.colorScheme.onSecondary,
                        disabledContentColor = AppTheme.colorScheme.tertiary,
                        disabledContainerColor = AppTheme.colorScheme.background,
                        )
                    ) {
                        Text(text = "배경 색 확인 버튼")
                    }
                }
            }
        }
        
        
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun MainPage_Preview(){
    CustomAppTheme {
     MainPage()
    }
}