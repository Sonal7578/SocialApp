// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}

buildscript {
    val kotlin_version = "1.3.72" // Example value, replace with your actual Kotlin version

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath("com.google.gms:google-services:4.2.0")
    }

    val appCompatVersion = "1.2.0"
    val constraintLayoutVersion = "2.0.2"
    val coreTestingVersion = "2.1.0"
    val coroutines = "1.3.9"
    val lifecycleVersion = "2.2.0"
    val materialVersion = "1.2.1"
    // testing
    val junitVersion = "4.13.1"
    val espressoVersion = "3.1.0"
    val androidxJunitVersion = "1.1.2"
}

val clean by tasks.registering(Delete::class) {
    delete(rootProject.buildDir)
}


