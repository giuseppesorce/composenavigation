package it.warpmobile.composenavigation.screens

import androidx.compose.runtime.*
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleObserver

/**
 * @author Giuseppe Sorce
 */
@Composable
fun <LO : LifecycleObserver> LO.observeLifecycle(lifecycle: Lifecycle) {
    DisposableEffect(lifecycle) {
        lifecycle.addObserver(this@observeLifecycle)
        onDispose {
            lifecycle.removeObserver(this@observeLifecycle)
        }
    }
}

@Composable
fun Lifecycle.observeLatestEvent(): State<Lifecycle.Event> {
    val latestEvent = remember { mutableStateOf(Lifecycle.Event.ON_ANY) }
    DisposableEffect(this) {
        val observer = LifecycleEventObserver { _, event ->
            latestEvent.value = event
        }
        addObserver(observer)
        onDispose {
            removeObserver(observer)
        }
    }
    return latestEvent
}