package com.example.cookapp.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cookapp.screens.CategoryScreen
import com.example.cookapp.screens.HomeScreen
import com.example.cookapp.screens.RecipeScreen


@Composable
fun AppNavigation(
    navController: NavController,
    padding: PaddingValues
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "homeScreen",
        modifier = Modifier.padding(padding)
    ) {
        composable(route = "homeScreen") {
            HomeScreen(navController = navController)
        }

        composable(route = "categoryScreen") {
            CategoryScreen(navController = navController, categoryId = 1)
        }

        composable(route = "recipeScreen") {
            RecipeScreen(navController = navController, recipeId = 2)
        }
    }
}