package com.example.androidapp2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidapp2.ui.theme.screens.login.LoginScreen
import com.example.androidapp2.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController(),
               startDestination:String = ROUTE_LOGIN){
        NavHost(navController = navController,
            startDestination = startDestination ){
            composable(ROUTE_REGISTER){ SignupScreen(navController)}
            composable(ROUTE_LOGIN){ LoginScreen(navController)}
        }


}