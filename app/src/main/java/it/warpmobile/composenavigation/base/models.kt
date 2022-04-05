package it.warpmobile.composenavigation.base

/**
 * @author Giuseppe Sorce
 */
sealed class NavigationEvents {
    object GotoSignup : NavigationEvents()
    object Home : NavigationEvents()
    object Detail : NavigationEvents()
    object Settings : NavigationEvents()
    object Login : NavigationEvents()
}