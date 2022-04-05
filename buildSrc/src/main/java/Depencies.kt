
object Versions {

    const val COMPOSE = "1.1.0"
    const val COMPOSE_NAVIGATION = "2.4.0-alpha08"
    const val COMPOSE_HILT_NAVIGATION = "1.0.0"
    const val COMPOSE_CONSTRAINS = "1.0.0"
    const val ACTIVITY = "1.4.0"
    const val KOTLIN = "1.6.10"
    const val HILT = "2.41"
    const val DAGGER_VERSION = "2.41"

    const val LIFECYCLE_VIEWMODEL = "1.0.0-alpha02"
    const val HILT_COMPILER = "1.0.0-alpha03"
    const val HILT_COMMON= "1.0.0"


    const val COREKTX = "1.7.0"
    const val APPCOMPACT = "1.4.1"
    const val CONSTRAINTLAYOUT = "2.1.2"

    //Testing
    const val JUNIT = "4.13.1"
    const val ANDROIDX_TEST_EXT = "1.1.2"
    const val ANDROIDX_TEST = "1.3.0"
    const val ESPRESSO_CORE = "3.3.0"
}

object Sdk {
    const val MIN_SDK_VERSION = 24
    const val TARGET_SDK_VERSION = 32
    const val COMPILE_SDK_VERSION = 32
    const val BUILD_TOOL_VERSION = "32.0.0"
}

object ComposeLibs {
    const val UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE}"
    const val TOOLING_PREVIEW =  "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"

    const val ACTIVITY = "androidx.activity:activity-compose:${Versions.ACTIVITY}"
    const val UI_TEST = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
    const val NAVIGATION = "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAVIGATION}"

    const val COMPOSE_ICONS = "androidx.compose.material:material-icons-extended:${Versions.COMPOSE}"
    const val COMPOSE_CONTRAINSLAYOUT = "androidx.constraintlayout:constraintlayout-compose:${Versions.COMPOSE_CONSTRAINS}"
    const val COMPOSE_PERMISSIONS= "com.google.accompanist:accompanist-permissions:0.22.1-rc"

    object DebugCompose{
        const val TOOLING_PREVIEW =  "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"

    }
}

object HiltLibs {

    const val ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val COMPOSE = "androidx.hilt:hilt-navigation-compose:1.0.0"
    const val HILT_NAVIGATION = "androidx.hilt:hilt-navigation-compose:${Versions.COMPOSE_HILT_NAVIGATION}"
    const val CORE = "com.google.dagger:hilt-core:${Versions.HILT}"
    const val COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    const val COMMONS = "androidx.hilt:hilt-common:${Versions.HILT_COMMON}"
    const val ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    const val HILT_KAPT = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    const val HILT_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.LIFECYCLE_VIEWMODEL}"
}

object AndroidXLibs {
    const val APP_COMPACT= "androidx.appcompat:appcompat:${Versions.ACTIVITY}"
    const val CORE = "androidx.core:core-ktx:1.7.0"
}

object AndroidXTestLibs {
    const val JUNIT = "androidx.test.ext:junit:1.1.3"
}

object TestLibs {
    const val JUNIT = "junit:junit:4.13.2"
}

object AndroidLibs {
    const val MATERIAL = "com.google.android.material:material:1.4.0"
}

