package it.warpmobile.composenavigation.screens.settings

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.navigation.NavHostController
import it.warpmobile.composenavigation.base.NavigationEvents
import it.warpmobile.composenavigation.screens.login.LoginViewModel
import it.warpmobile.composenavigation.screens.observeLatestEvent
import kotlinx.coroutines.flow.collectLatest

/**
 * @author Giuseppe Sorce
 */
@Composable
fun Settings(viewModel: SettingsViewModel) {



    val latestEvent by LocalLifecycleOwner.current.lifecycle.observeLatestEvent()
    if (latestEvent == Lifecycle.Event.ON_START) {

    }

    if (latestEvent == Lifecycle.Event.ON_DESTROY) {
        Log.i("navigation", "Lifecycle.Event.ON_DESTROY" )
    }
    if (latestEvent == Lifecycle.Event.ON_CREATE) {

        Log.i("navigation", "Lifecycle.Event.ON_CREATE" )
    }
    if (latestEvent == Lifecycle.Event.ON_RESUME) {
        LaunchedEffect(latestEvent) {
            viewModel.fetchProducts()
        }
    }

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
}

