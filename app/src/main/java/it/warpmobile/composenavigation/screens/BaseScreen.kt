package it.warpmobile.composenavigation.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import it.warpmobile.composenavigation.base.BaseViewModel
import kotlinx.coroutines.flow.collectLatest

/**
 * @author Giuseppe Sorce
 */
@Composable
fun BaseScreen(
    navController: NavHostController, viewModel: BaseViewModel, content: @Composable (viewModel: BaseViewModel) -> Unit
) {

    content(viewModel)

    LaunchedEffect(Unit) {
        viewModel.navigationState.collectLatest {
            navController.navigate(it.path)
        }
    }

}