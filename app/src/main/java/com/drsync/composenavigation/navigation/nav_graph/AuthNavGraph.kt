package com.drsync.composenavigation.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.drsync.composenavigation.navigation.AUTHENTICATION_ROUTE
import com.drsync.composenavigation.navigation.Screen
import com.drsync.composenavigation.screens.LoginScreen
import com.drsync.composenavigation.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
    }
}