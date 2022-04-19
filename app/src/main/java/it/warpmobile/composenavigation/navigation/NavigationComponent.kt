
package it.warpmobile.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import it.warpmobile.composenavigation.navigation.routing.Destination
import it.warpmobile.composenavigation.screens.BaseScreen
import it.warpmobile.composenavigation.screens.detail.Detail
import it.warpmobile.composenavigation.screens.detail.DetailViewModel
import it.warpmobile.composenavigation.screens.home.Home
import it.warpmobile.composenavigation.screens.home.HomeViewModel
import it.warpmobile.composenavigation.screens.login.Login
import it.warpmobile.composenavigation.screens.login.LoginViewModel
import it.warpmobile.composenavigation.screens.settings.Settings
import it.warpmobile.composenavigation.screens.settings.SettingsViewModel
import it.warpmobile.composenavigation.screens.signup.Signup
import it.warpmobile.composenavigation.screens.signup.SignupViewModel

@Composable
fun NavigationComponent(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Destination.Login.path) {
        composable(Destination.Login.path) {

            val viewModel = viewModel<LoginViewModel>()


            BaseScreen(navController, viewModel){
                Login(viewModel)
            }
        }

        composable(Destination.Signup.path) {
            val viewModel = viewModel<SignupViewModel>()
            BaseScreen(navController, viewModel){
                Signup(viewModel)
            }

        }
        composable(Destination.Home.path){
            val viewModel = viewModel<HomeViewModel>()
            BaseScreen(navController, viewModel){
                Home(viewModel)
            }
        }
        composable(Destination.Settings.path){
            val viewModel = viewModel<SettingsViewModel>()
            BaseScreen(navController, viewModel){
                Settings(viewModel)
            }

        }
        composable(Destination.Detail.path){
            val viewModel = viewModel<DetailViewModel>()
            BaseScreen(navController, viewModel){
                Detail(viewModel)
            }
        }
    }
}

