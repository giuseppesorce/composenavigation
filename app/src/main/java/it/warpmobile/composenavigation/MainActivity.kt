package it.warpmobile.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import it.warpmobile.composenavigation.navigation.NavigationComponent
import it.warpmobile.composenavigation.ui.theme.ComposeNavigationTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            ComposeNavigationTheme {
                NavigationComponent(navController)
            }
        }
    }
}
