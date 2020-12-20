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

package app.chamich.library.prefs

import android.content.Context
import android.content.SharedPreferences

/**
 * This class provides access to the application preferences. To create an
 * instance of the [Preferences] class you need to provide an application [Context]
 */
class Preferences(private val preferences: SharedPreferences)
