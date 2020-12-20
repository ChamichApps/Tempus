/*
 * Copyright 2020 chamich.app
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  imitations under the License.
 */

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
    // Libraries
    implementation(project(BuildModules.Libraries.DESIGN))

    // Features
    implementation(project(BuildModules.Features.AUTHENTICATION))
    implementation(project(BuildModules.Features.HOME))
    implementation(project(BuildModules.Features.PROJECTS))
    implementation(project(BuildModules.Features.RECORDS))
    implementation(project(BuildModules.Features.SETTINGS))

    // Other Dependencies
    implementation(Dependencies.KOTLIN)
    implementation(Dependencies.KOTLIN_STDLIB)
    implementation(Dependencies.NAVIGATION_FRAGMENT)
    implementation(Dependencies.NAVIGATION_UI_KTX)
}