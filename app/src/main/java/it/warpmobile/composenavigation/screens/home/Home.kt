package it.warpmobile.composenavigation.screens.home

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
fun Home(viewModel: HomeViewModel) {

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "HOME", fontSize = 27.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            viewModel.handleEvent(NavigationEvents.Detail)

        }) {
            Text(text = "GOTO DETAIL")

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            viewModel.handleEvent(NavigationEvents.Settings)
        }) {
            Text(text = "GOTO SETTINGS")
        }
    }
}