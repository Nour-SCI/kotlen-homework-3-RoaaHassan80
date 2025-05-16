rootProject.name = "kotlen-homework-3-RoaaHassan80"

pluginManagement {
    plugins {
        id("org.jetbrains.kotlin.jvm") version "1.8.22"
        id("io.gitlab.arturbosch.detekt") version "1.23.0" apply false
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

include("module1", "module2")