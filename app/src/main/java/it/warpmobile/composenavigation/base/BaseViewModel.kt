
package it.warpmobile.composenavigation.base


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.warpmobile.composenavigation.navigation.routing.Destination
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
open class BaseViewModel @Inject constructor() : ViewModel() {

    protected val _navigationState: MutableSharedFlow<Destination> = MutableSharedFlow()
    val navigationState: SharedFlow<Destination> = _navigationState

     fun gotoScreen(destination: Destination) {
        viewModelScope.launch {
            _navigationState.emit(destination)
        }
    }
}