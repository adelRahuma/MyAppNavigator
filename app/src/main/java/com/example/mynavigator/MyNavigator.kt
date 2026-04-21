package com.example.mynavigator

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynavigator.Views.*


@Composable
fun MyNavigator(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Login") {
        composable("Login") { Login(modifier, navController) }
        composable("Signup") { Signup(modifier, navController) }
        composable("Home") { Home(modifier, navController) }
    }
}




