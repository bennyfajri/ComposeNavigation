package com.drsync.composenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.drsync.composenavigation.navigation.AUTHENTICATION_ROUTE
import com.drsync.composenavigation.navigation.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
                navController.navigate(
                    route = Screen.Detail.passNameAndId(
                        id = 69
                    )

                    /** REQUIRED ARGUMENTS */
//                    route = Screen.Detail.passNameAndId(
//                        10,
//                        "Benny Fajri"
//                    )
                )
            }
        )

        Text(
            text = "Login/Sign Up",
            color = Color.Black,
            fontWeight = FontWeight.Medium,
            fontFamily = MaterialTheme.typography.h6.fontFamily,
            modifier = Modifier
                .padding(top = 20.dp)
                .clickable {
                    navController.navigate(AUTHENTICATION_ROUTE)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navController = rememberNavController()
    )
}