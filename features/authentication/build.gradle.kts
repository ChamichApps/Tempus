import dependencies.Dependencies

plugins {
    id("commons.android-feature")
}

dependencies {
    implementation(project(BuildModules.Libraries.DESIGN))
}