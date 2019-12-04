rootProject.name = "kotlin-material-ui-sample"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin-multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
    /*enable here when you need other plugins.
    repositories {
        google()
        jcenter()
        mavenCentral()
        gradlePluginPortal()
    }*/
}