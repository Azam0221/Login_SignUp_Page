package com.example.login_signup_page

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login_signup_page.pages.HomePage
import com.example.login_signup_page.pages.LoginPage
import com.example.login_signup_page.pages.SignupPage

@Composable
fun MyAppNavigation(modifier: Modifier= Modifier,authViewModel: AuthViewModel){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login",
        builder = {
           composable("login"){
               LoginPage(modifier,navController,authViewModel )
           }
            composable("signUp"){
                SignupPage(modifier,navController,authViewModel )
            }
            composable("home"){
                HomePage(modifier,navController,authViewModel )
            }
// Changes made
        }
    )
}