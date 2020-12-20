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

package app.chamich.library.prefs.di

import android.content.Context
import app.chamich.library.prefs.Preferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

/**
 * Hilt class
 * This class will be injected into [ApplicationContext] and will provide [Preferences]
 */
@Module
@InstallIn(ApplicationComponent::class)
object PreferencesModule {

    private const val PREFERENCES_FILE_NAME = "app.chamich.library.prefs.TEPUOS_PREFERENCES"

    /**
     * Provides [Preferences] instance.
     */
    @Singleton
    @Provides
    fun providePreferences(@ApplicationContext context: Context) = Preferences(
        context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE)
    )
}
