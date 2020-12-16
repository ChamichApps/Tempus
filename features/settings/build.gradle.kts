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

plugins {
    id("commons.android-feature")
}

dependencies {
    implementation(project(BuildModules.Libraries.DESIGN))
    
    // All common dependencies are taken from:
    //   buildSrc/.../commons/android-feature.gradle.kts
    //
    // If you need to add a dependency specefic ONLY to this module do it here.
}
