pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    //esto se agrego
    plugins {
        id("com.google.devtools.ksp") version "1.6.20-1.0.5"
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PassLockcr"
include(":app")
