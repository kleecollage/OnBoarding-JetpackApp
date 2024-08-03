package com.example.onboardingapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.onboardingapp.navigation.NavManager
import com.example.onboardingapp.onBoardViews.MainOnBoarding
import com.example.onboardingapp.ui.theme.OnBoardingAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OnBoardingAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    NavManager()
                }
            }
        }
    }
}
