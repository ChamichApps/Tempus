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


/** Build modules used in the application */
object BuildModules {

    private const val FEATURES = ":features"
    private const val LIBRARIES = ":libraries"

    /** Keeps library name constants */
    object Libraries {
        const val DESIGN = "$LIBRARIES:design"
        const val PREFS = "$LIBRARIES:prefs"
    }

    /** Keeps feature name constants */
    object Features {
        const val AUTHENTICATION = "$FEATURES:authentication"
        const val PROJECTS = "$FEATURES:projects"
        const val RECORDS = "$FEATURES:records"
        const val SETTINGS = "$FEATURES:settings"
    }
}