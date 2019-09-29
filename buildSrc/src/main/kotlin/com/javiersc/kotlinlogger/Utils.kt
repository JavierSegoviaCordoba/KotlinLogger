package com.javiersc.kotlinlogger

import org.gradle.api.Project
import java.util.*


fun Project.getLocalProperties() =
    Properties().apply { load(rootProject.file("local.properties").inputStream()) }