import dependencies.Dependencies

plugins {
    id(PluginConfigs.ANDROID_APPLICATION)
    id(PluginConfigs.KOTLIN_ANDROID)
    id(PluginConfigs.KOTLIN_ANDROID_EXTENSIONS)
}

android {
    compileSdkVersion(AndroidConfigs.COMPILE_SDK_VERSION)
    buildToolsVersion(AndroidConfigs.BUILD_TOOLS_VERSION)

    defaultConfig {
        applicationId(AndroidConfigs.APPLICATION_ID)
        minSdkVersion(AndroidConfigs.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfigs.TARGET_SDK_VERSION)
        versionCode(AndroidConfigs.VERSION_CODE)
        versionName(AndroidConfigs.VERSION_NAME)
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

dependencies {
    implementation(Dependencies.KOTLIN)
    implementation(Dependencies.KOTLIN_STDLIB)
    implementation(Dependencies.APPCOMPAT)
    implementation(Dependencies.MATERIAL)
}