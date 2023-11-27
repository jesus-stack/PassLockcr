package com.utn.passlockcr.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.utn.passlockcr.Home
import com.utn.passlockcr.ui.theme.singin.Signin
import com.utn.passlockcr.ui.theme.singin.SigninDestination


@Composable
fun PassLockNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        //startDestination = HomeDestination.route,
        startDestination = SigninDestination.route,
        modifier = modifier
    ) {
        composable(route = SigninDestination.route) {
            //Signin(
                //navigateToHome = { navController.navigate(HomeDestination.route) }
            //)
        }
    }
}
