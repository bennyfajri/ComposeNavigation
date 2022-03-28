package com.drsync.composenavigation.navigation.nav_graph

import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.drsync.composenavigation.screens.DetailScreen
import com.drsync.composenavigation.navigation.HOME_ROUTE
import com.drsync.composenavigation.navigation.ID_DETAIL
import com.drsync.composenavigation.navigation.NAME_DETAIL
import com.drsync.composenavigation.navigation.Screen
import com.drsync.composenavigation.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
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
            DetailScreen(navController = navController)
        }
    }
}