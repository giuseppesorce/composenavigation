
package it.warpmobile.composenavigation.screens.home


import dagger.hilt.android.lifecycle.HiltViewModel
import it.warpmobile.composenavigation.base.BaseViewModel
import it.warpmobile.composenavigation.base.NavigationEvents
import it.warpmobile.composenavigation.navigation.routing.Destination
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel() {


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

}