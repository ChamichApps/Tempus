package commons

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(AndroidConfigs.COMPILE_SDK_VERSION)
    buildToolsVersion(AndroidConfigs.BUILD_TOOLS_VERSION)

    defaultConfig {
        minSdkVersion(AndroidConfigs.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfigs.TARGET_SDK_VERSION)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}