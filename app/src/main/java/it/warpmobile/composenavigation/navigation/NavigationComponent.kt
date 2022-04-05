
package it.warpmobile.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import it.warpmobile.composenavigation.navigation.routing.Destination
import it.warpmobile.composenavigation.screens.detail.Detail
import it.warpmobile.composenavigation.screens.home.Home
import it.warpmobile.composenavigation.screens.login.Login
import it.warpmobile.composenavigation.screens.settings.Settings
import it.warpmobile.composenavigation.screens.signup.Signup

@Composable
fun NavigationComponent(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Destination.Login.path
    ) {
        composable(Destination.Login.path) {
            Login(navController)
        }
        composable(Destination.Signup.path) {

            Signup(navController)
        }
        composable(Destination.Home.path){
            Home(navController)
        }
        composable(Destination.Settings.path){
            Settings(navController)
        }
        composable(Destination.Detail.path){
            Detail(navController)
        }
    }
}