package it.warpmobile.composenavigation.screens.settings

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import it.warpmobile.composenavigation.base.NavigationEvents
import it.warpmobile.composenavigation.screens.login.LoginViewModel
import kotlinx.coroutines.flow.collectLatest

/**
 * @author Giuseppe Sorce
 */
@Composable
fun Settings(navController: NavHostController) {
    val viewModel = hiltViewModel<SettingsViewModel>()

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "SETTINGS", fontSize = 27.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            viewModel.handleEvent(NavigationEvents.Home)

        }) {
            Text(text = "GOTO HOME")

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            viewModel.handleEvent(NavigationEvents.Login)

        }) {
            Text(text = "GOTO LOGIN")

        }
    }

    LaunchedEffect(Unit) {

        viewModel.navigationState.collectLatest {
            navController.navigate(it.path)
        }
    }
}