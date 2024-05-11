// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
    }
    dependencies {
        val navVersion = "2.7.5"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}
plugins {
    id ("com.android.application") version "7.3.1" apply false
    id ("com.android.library") version "7.3.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}

/*
Navigation is a framework for navigating between 'destinations' within an Android application that
provides a consistent API whether destinations are implemented as Fragments, Activities, or
other components.
*/

/*
Kotlin Symbol Processing (KSP) is an API that you can use to develop lightweight compiler plugins.
KSP provides a simplified compiler plugin API that leverages the power of Kotlin while keeping the
learning curve at a minimum. Compared to kapt, annotation processors that use KSP can run up to
two times faster.
 */