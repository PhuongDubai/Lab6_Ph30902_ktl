package com.example.lab6_ph30902_ktl

import androidx.compose.runtime.Composable

import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.lab6_ph30902_ktl.screens.CinemaSeatBookingScreen
import com.example.lab6_ph30902_ktl.util.createTheaterSeating


enum class ROUTE_NAME {
    main,
    bai1,
    bai2,
    bai3,
}

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = ROUTE_NAME.main.name) {
        composable(ROUTE_NAME.main.name) { baitap(navController) }
        composable(ROUTE_NAME.bai1.name) { MovieScreen(Movie.getSampleMovies()) }
        composable(ROUTE_NAME.bai2.name) {CinemaSeatBookingScreen(
            createTheaterSeating(
                totalRows = 12,
                totalSeatsPerRow = 9,
                aislePositionInRow = 4,
                aislePositionInColumn = 5
            ), totalSeatsPerRow = 9
        )}

    }
}