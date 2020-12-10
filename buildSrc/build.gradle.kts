plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    google()
    jcenter()
}

object PluginsVersions {
    const val GRADLE_ANDROID = "4.1.1"
    const val KOTLIN = "1.4.10"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginsVersions.GRADLE_ANDROID}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.KOTLIN}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${PluginsVersions.KOTLIN}")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${PluginsVersions.KOTLIN}")
}