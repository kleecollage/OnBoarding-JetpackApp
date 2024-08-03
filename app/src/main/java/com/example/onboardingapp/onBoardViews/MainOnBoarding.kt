package com.example.onboardingapp.onBoardViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.onboardingapp.R
import com.example.onboardingapp.data.PageData
import com.example.onboardingapp.dataStore.StoreBoarding

@Composable
fun MainOnBoarding(navController: NavController, store: StoreBoarding) {
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Title 1",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac justo euismod, venenatis libero in, tincidunt quam."
        )
    )
    items.add(
        PageData(
            R.raw.page2,
            "Title 2",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac justo euismod, venenatis libero in, tincidunt quam."
        )
    )
    items.add(
        PageData(
            R.raw.page3,
            "Title 3",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac justo euismod, venenatis libero in, tincidunt quam."
        )
    )
    items.add(
        PageData(
            R.raw.page4,
            "End",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac justo euismod, venenatis libero in, tincidunt quam."
        )
    )

    val pagerState = rememberPagerState (
        pageCount = { items.size },
        initialPage = 0,
        /* initialOffscreenLimit = { 2 },
        infiniteLoop = { false } */
    )

    OnBoardingPager(
        item = items,
        pagerState =pagerState,
        navController = navController,
        store = store,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White)
    )

}