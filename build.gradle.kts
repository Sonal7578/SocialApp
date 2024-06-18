//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    alias(libs.plugins.android.application) apply false
//    alias(libs.plugins.jetbrains.kotlin.android) apply false
//    alias(libs.plugins.google.gms.google.services) apply false
//}
//
//buildscript {
//    val kotlin_version = "1.3.72" // Example value, replace with your actual Kotlin version
//
//    repositories {
//        google()
//        jcenter()
//    }
//    dependencies {
//        classpath("com.android.tools.build:gradle:4.0.0")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
//        classpath("com.google.gms:google-services:4.2.0")
//    }
//
//    val appCompatVersion = "1.2.0"
//    val constraintLayoutVersion = "2.0.2"
//    val coreTestingVersion = "2.1.0"
//    val coroutines = "1.3.9"
//    val lifecycleVersion = "2.2.0"
//    materialVersion = "1.3.0"
//    // testing
//    val junitVersion = "4.13.1"
//    val espressoVersion = "3.1.0"
//    val androidxJunitVersion = "1.1.2"
//}
//
//val clean by tasks.registering(Delete::class) {
//    delete(rootProject.buildDir)
//}
//
//



// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlin_version by extra("1.9.24")
    //val kotlin_version = "1.3.72"
    val compose_version by extra("1.5.14")
    //kotlin_version = '1.9.0'

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.3.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath ("com.google.gms:google-services:4.3.10")


//        // Update to the latest Gradle version
//        classpath 'com.android.tools.build:gradle:4.3.1'
        // Update to the latest Kotlin version
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

    repositories {
        google()
        jcenter()
    }
}

//allprojects {
//    repositories {
//        google()
//        jcenter()
//    }
//}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

ext {
    set("appCompatVersion", "1.2.0")
    set("constraintLayoutVersion", "2.0.2")
    set("coreTestingVersion", "2.1.0")
    set("coroutines", "1.3.9")
    set("lifecycleVersion", "2.2.0")
    set("materialVersion", "1.2.1")
    // testing
    set("junitVersion", "4.13.1")
    set("espressoVersion", "3.1.0")
    set("androidxJunitVersion", "1.1.2")
}
