import com.javiersc.kotlinlogger.getLocalProperties
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `maven-publish`
    id(Plugins.bintray) version Versions.bintray
    id(Plugins.Kotlin.jvm) version Versions.kotlin
    id(Plugins.Kotlin.serialization) version Versions.kotlin
}

group = Project.group
version = Project.version

repositories {
    jcenter()
}

dependencies {
    Dependencies.Kotlin.apply {
        api(stdlib)
        api(reflect)
        api(serializationRuntime)
    }
}

tasks {
    withType<Delete> { delete(buildDir) }
    withType<KotlinCompile> { kotlinOptions { jvmTarget = Project.jvmVersion } }
}

val sourcesJar: Jar by tasks.creating(Jar::class) {
    archiveClassifier.set(Project.archiveClassifierSet)
    from(sourceSets.main.get().allSource)
}

tasks.withType<KotlinCompile>().all {
    kotlinOptions.freeCompilerArgs = listOf(
        "-Xuse-experimental=kotlin.Experimental",
        "-Xuse-experimental=kotlinx.serialization.UnstableDefault",
        "-Xuse-experimental=kotlinx.serialization.ImplicitSerialization",
        "-Xuse-experimental=kotlinx.serialization.ImplicitReflectionSerializer"
    )
}

val localProperties = getLocalProperties()

bintray {
    user = localProperties.getProperty(BintrayJVM.user)
    key = localProperties.getProperty(BintrayJVM.key)
    publish = true
    pkg.apply {
        repo = BintrayJVM.repo
        name = BintrayJVM.name
        userOrg = BintrayJVM.userOrg
        description = BintrayJVM.description
        websiteUrl = BintrayJVM.websiteUrl
        setLicenses(BintrayJVM.licenses)
        issueTrackerUrl = BintrayJVM.issueTrackerUrl
        vcsUrl = BintrayJVM.vscUrl
        version.apply { name = BintrayJVM.version }
        setLabels(BintrayJVM.label1, BintrayJVM.label2, BintrayJVM.label3, BintrayJVM.label4)
    }
    setPublications(BintrayJVM.name)
}

publishing {
    publications {
        create<MavenPublication>(BintrayJVM.name) {
            groupId = BintrayJVM.groupId
            artifactId = BintrayJVM.artifactId
            version = BintrayJVM.version
            artifact(sourcesJar)
            artifact(BintrayJVM.artifactDir)
        }
    }
}