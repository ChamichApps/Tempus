package dependencies

/** Dependency versions */
private object Versions {
    const val KOTLIN = "1.3.61"
    const val APPCOMPAT = "1.1.0"
    const val MATERIAL = "1.1.0-beta01"
}

/** Project Dependencies */
object Dependencies {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
}