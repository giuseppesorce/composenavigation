package it.warpmobile.composenavigation.screens.settings

import dagger.hilt.android.lifecycle.HiltViewModel
import it.warpmobile.composenavigation.base.BaseViewModel
import it.warpmobile.composenavigation.base.NavigationEvents
import it.warpmobile.composenavigation.navigation.routing.Destination
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor() : BaseViewModel() {


    fun handleEvent(events: NavigationEvents) {
        when(events){
            is NavigationEvents.Home->{
                gotoScreen(Destination.Home)
            }
            is NavigationEvents.Login->{
                gotoScreen(Destination.Login)
            }
        }
    }
}