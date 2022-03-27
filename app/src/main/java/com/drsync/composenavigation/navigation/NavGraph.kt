package com.drsync.composenavigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.drsync.composenavigation.navigation.ID_DETAIL
import com.drsync.composenavigation.navigation.NAME_DETAIL
import com.drsync.composenavigation.navigation.Screen
import com.drsync.composenavigation.screens.HomeScreen

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navHostController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(ID_DETAIL) {
                    type = NavType.IntType
                    defaultValue = 0
//                    nullable = true
                },
                navArgument(NAME_DETAIL) {
                    type = NavType.StringType
                }
            )
        ) {
            Log.d("Args", it.arguments?.getInt(ID_DETAIL).toString())
            Log.d("Args", it.arguments?.getString(NAME_DETAIL).toString())
            DetailScreen(navController = navHostController)
        }
    }
}