package com.drsync.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.drsync.composenavigation.navigation.nav_graph.SetupNavGraph
import com.drsync.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {

                navController = rememberNavController()
                SetupNavGraph(navHostController = navController)

            }
        }
    }
}
