package com.example.onboardingapp.onBoardViews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.onboardingapp.data.PageData
import com.example.onboardingapp.dataStore.StoreBoarding

@Composable
fun OnBoardingPager(
    item: List<PageData>,
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    navController: NavController,
    store: StoreBoarding
) {
   Box(modifier = modifier) {
       Column( horizontalAlignment = Alignment.CenterHorizontally) {
           HorizontalPager(state = pagerState) { page ->
               Column(
                   horizontalAlignment = Alignment.CenterHorizontally,
                   modifier = Modifier
                       .padding(60.dp)
                       .fillMaxWidth()
               ) {
                   LoaderData(
                       image = item[page].image,
                       modifier = Modifier
                           .size(200.dp)
                           .fillMaxWidth()
                           .align(Alignment.CenterHorizontally),
                   )
                   Text(
                       text = item[page].title,
                       modifier = Modifier.padding(top = 50.dp),
                       color = Color.Black,
                       style = MaterialTheme.typography.displayMedium,
                       fontWeight = FontWeight.Bold
                       )
                   Text(
                       text = item[page].description,
                       color = Color.Black,
                       textAlign = TextAlign.Center,
                       fontWeight = FontWeight.Light,
                       fontSize = 20.sp
                   )
               }
           }
           PagerIndicator(size = item.size, currentPage = pagerState.currentPage )
       }
       Box(modifier = Modifier.align(Alignment.BottomCenter)) {
           ButtonFinish(currentPage = pagerState.currentPage, navController, store)
       }
   }
}


















