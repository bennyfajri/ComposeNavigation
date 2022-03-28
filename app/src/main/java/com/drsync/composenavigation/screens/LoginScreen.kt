package com.drsync.composenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import com.drsync.composenavigation.navigation.HOME_ROUTE
import com.drsync.composenavigation.navigation.Screen

@Composable
fun LoginScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.Magenta,
            modifier = Modifier.clickable {
                navController.navigate(Screen.SignUp.route)
            }
        )
        Text(
            text = "Go Back",
            modifier = Modifier
                .padding(top = 20.dp)
                .clickable {
                    navController.navigate(HOME_ROUTE) {
                        popUpTo(HOME_ROUTE)
                    }
                },
            fontWeight = FontWeight.Medium,
            fontSize = MaterialTheme.typography.h6.fontSize
        )
        Text(
            text = "Go To Detail screen",
            modifier = Modifier
                .clickable {
                    navController.popBackStack()
                    navController.navigate(Screen.Detail.passNameAndId())
                },
            fontWeight = FontWeight.Medium,
            fontSize = MaterialTheme.typography.h6.fontSize
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(navController = rememberNavController())
}