package com.drsync.composenavigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.drsync.composenavigation.navigation.HOME_ROUTE
import com.drsync.composenavigation.navigation.ROOT_ROUTE

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navController = navHostController)
        authNavGraph(navController = navHostController)
    }
}