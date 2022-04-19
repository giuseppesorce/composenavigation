
package it.warpmobile.composenavigation.screens.home


import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import dagger.hilt.android.lifecycle.HiltViewModel
import it.warpmobile.composenavigation.base.BaseViewModel
import it.warpmobile.composenavigation.base.NavigationEvents
import it.warpmobile.composenavigation.navigation.routing.Destination
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel(), DefaultLifecycleObserver {


    fun handleEvent(events: NavigationEvents) {
        when(events){
            is NavigationEvents.Detail->{
                gotoScreen(Destination.Detail)
            }
            is NavigationEvents.Settings->{
                gotoScreen(Destination.Settings)
            }
        }

    }

    override fun onResume(owner: LifecycleOwner) {
        Log.i("navigation", "Home resume" )
    }

}


