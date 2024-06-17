plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
    id ("kotlin-kapt") // Adding kotlin-kapt plugin
}

android {
    namespace = "com.example.socialapp"
    namespace = "com.example.myapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.socialapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.firestore)
    implementation(libs.androidx.activity)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    implementation("androidx.appcompat:appcompat:1.4.1")

  //  implementation ("androidx.appcompat:appcompat:$rootProject.appCompatVersion")

    //Coroutines
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.72")
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-core:$rootProject.coroutines")
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-android:$rootProject.coroutines")


    // UI
    implementation ("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation ("com.google.android.material:material:$rootProject.materialVersion")

    /* coroutines support for firebase operations */
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.1.1")


    // Import the BoM for the Firebase platform
    implementation (platform("com.google.firebase:firebase-bom:26.1.0"))
    implementation ("com.google.firebase:firebase-firestore")
    implementation ("com.google.firebase:firebase-auth-ktx")
    implementation ("com.firebaseui:firebase-ui-firestore:6.4.0")

    implementation ("com.google.android.gms:play-services-auth:19.0.0")

    implementation ("com.github.bumptech.glide:glide:4.11.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")

    // Testing
    testImplementation ("junit:junit:$rootProject.junitVersion")
    androidTestImplementation ("androidx.arch.core:core-testing:$rootProject.coreTestingVersion")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:$rootProject.espressoVersion", {
//        exclude group: 'com.android.support', module: 'support-annotations'
//    })
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    androidTestImplementation ("androidx.test.ext:junit:$rootProject.androidxJunitVersion")

}
//plugins {
//    id("com.android.application")
//    id("kotlin-android")
//    id ("com.google.gms.google-services") // Add this if using Google services
//    id ("kotlin-kapt") // Adding kotlin-kapt plugin
//}
//
//android {
//    compileSdk = 34
//    defaultConfig {
//        applicationId = "com.example.socialapp"
//        minSdk = 21
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//        testInstrumentationRunner=  "androidx.test.runner.AndroidJUnitRunner"
//
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles (
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//
//}
//
//dependencies {
//    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
//    implementation ("androidx.core:core-ktx:1.10.1")
//    implementation ("androidx.appcompat:appcompat:1.6.1")
//    implementation ("com.google.android.material:material:1.9.0")
//    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
//    implementation ("com.google.android.gms:play-services-auth:20.5.0")
//    implementation ("com.google.firebase:firebase-auth-ktx:22.1.1")
//    implementation ("com.google.firebase:firebase-firestore-ktx:24.3.2")
//    testImplementation ("junit:junit:4.13.2")
//    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
//}
