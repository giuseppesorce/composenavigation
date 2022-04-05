plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    compileSdk = Sdk.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = AppConfiguration.APPLICATION_ID
        minSdk = Sdk.MIN_SDK_VERSION
        targetSdk = Sdk.TARGET_SDK_VERSION
        versionCode = AppConfiguration.VERSION_CODE
        versionName = AppConfiguration.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFile(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {



    implementation(AndroidXLibs.CORE)

    implementation(AndroidXLibs.APP_COMPACT)
    implementation(AndroidLibs.MATERIAL)

    implementation(ComposeLibs.UI)
    implementation(ComposeLibs.MATERIAL)
    implementation(ComposeLibs.TOOLING_PREVIEW)
    implementation(ComposeLibs.ACTIVITY)
    implementation(ComposeLibs.COMPOSE_ICONS)
    implementation(ComposeLibs.COMPOSE_CONTRAINSLAYOUT)

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")


    testImplementation(TestLibs.JUNIT)
    androidTestImplementation(AndroidXTestLibs.JUNIT)
    androidTestImplementation(ComposeLibs.UI_TEST)


    debugImplementation(ComposeLibs.DebugCompose.TOOLING_PREVIEW)

    implementation(HiltLibs.ANDROID)
    kapt(HiltLibs.ANDROID_COMPILER)
    implementation(HiltLibs.HILT_NAVIGATION)
    implementation(HiltLibs.COMMONS)
    kapt(HiltLibs.HILT_NAVIGATION)
    kapt(HiltLibs.ANDROID)













}