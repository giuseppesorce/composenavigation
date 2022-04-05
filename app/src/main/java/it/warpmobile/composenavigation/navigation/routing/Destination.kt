package it.warpmobile.composenavigation.navigation.routing

/**
 * @author Giuseppe Sorce
 */
sealed class Destination(
    val path: String,
    val isRootDestination: Boolean = true
) {

    companion object {
        fun fromString(route: String?): Destination {
            return when (route) {
                Login.path -> Login
                Home.path -> Home
                Detail.path -> Detail
                Settings.path -> Settings
                Signup.path -> Signup
                else -> Home
            }
        }
    }

    object Home : Destination("home")
    object Login : Destination("login")
    object Detail : Destination("detail")
    object Settings : Destination("settings")
    object Signup : Destination("signup")

}
