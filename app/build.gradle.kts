plugins {
    id("com.android.application")
}

android {
    namespace = "com.fabiansuarez.mywallet"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.fabiansuarez.mywallet"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //implementacion de los colores
    implementation("com.github.yukuku:ambilwarna:2.0.1")
    //implementacion para la imagen redodna
    implementation("de.hdodenhof:circleimageview:3.0.1")
    //Picasso para poder mostrar imagenes de internet
    implementation("com.squareup.picasso:picasso:2.8")

    // implementación de lottie splash screen
    implementation ("com.airbnb.android:lottie:6.1.0")
}

