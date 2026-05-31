package com.example.cookapp

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.cookapp.navigation.AppNavigation


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCookApp() {

    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "App de recetas")
                }
            )
        }
    ) { paddingValues ->

        AppNavigation(
            navController = navController,
            padding = paddingValues
        )
    }

}