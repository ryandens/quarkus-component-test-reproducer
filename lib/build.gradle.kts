/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.12.1/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    `java-library`
    alias(libs.plugins.quarkus)
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation(platform(libs.quarkus.bom))
    implementation("io.smallrye:smallrye-config")
    implementation("jakarta.enterprise:jakarta.enterprise.cdi-api")
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.quarkus:quarkus-junit5-component")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
