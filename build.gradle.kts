group = Packages.group
version = "1.0-SNAPSHOT"
allprojects {
    repositories {
        mavenCentral()
        jcenter()
        maven("https://kotlin.bintray.com/kotlin-js-wrappers")
        maven("https://kotlin.bintray.com/kotlinx")
        maven( "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
plugins {
    kotlin(module="js") version "1.0.7-eap-53"
}
