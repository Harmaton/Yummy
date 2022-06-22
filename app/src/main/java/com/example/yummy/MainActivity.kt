package com.example.yummy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.yummy.onboarding.onbordingpages
import com.example.yummy.onboarding.pageUI
import com.example.yummy.ui.theme.YummyTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YummyTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    OnboardingUI()

                }
            }
        }
    }

}
@ExperimentalPagerApi
@Composable
fun OnboardingUI(

) {
    val pagerState = rememberPagerState(pageCount = 3)
    Column() {
        Text(text = "skip", modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clickable {  })
    }
HorizontalPager(state = pagerState,
modifier = Modifier.fillMaxWidth()){
        page ->
    pageUI(page = onbordingpages[page])

}

    HorizontalPagerIndicator(pagerState = pagerState, modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        , activeColor = Color.Red
    )
    AnimatedVisibility(visible = pagerState.currentPage == 2) {
        OutlinedButton(shape = RoundedCornerShape(20.dp), modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
            , onClick = {}  ){
                Text(text = "Let's start")
            }
        
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YummyTheme {
       OnboardingUI()
    }
}