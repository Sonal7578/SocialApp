plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
    id ("kotlin-kapt") // Adding kotlin-kapt plugin
}

android {
    namespace = "com.example.socialapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.socialapp"
        minSdk = 23
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
        kotlinCompilerExtensionVersion = "1.5.14"
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
    implementation(libs.firebase.auth.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    implementation("androidx.appcompat:appcompat:1.7.0")

  //  implementation ("androidx.appcompat:appcompat:$rootProject.appCompatVersion")

    //Coroutines
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.9.20")
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
    api ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")


    // UI
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.google.android.material:material:1.12.0")

    /* coroutines support for firebase operations */
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.3")


    // Import the BoM for the Firebase platform
    implementation (platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation ("com.google.firebase:firebase-firestore")

//    implementation("com.google.firebase:firebase-analytics") //new
//    implementation("com.google.firebase:firebase-auth") //new

//    implementation ("com.google.firebase:firebase-auth-ktx:22.0.0")
    implementation ("com.firebaseui:firebase-ui-database:8.0.2")

    implementation ("com.google.android.gms:play-services-auth:21.2.0")

    implementation ("com.github.bumptech.glide:glide:4.11.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")


    // Testing
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("androidx.arch.core:core-testing:2.2.0")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:$rootProject.espressoVersion", {
//        exclude group: 'com.android.support', module: 'support-annotations'
//    })
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    androidTestImplementation ("androidx.test.ext:junit:1.1.1")



    // Replace annotationProcessor with kapt
    kapt("com.github.bumptech.glide:compiler:4.11.0")
    implementation ("com.github.bumptech.glide:glide:4.11.0")

}
