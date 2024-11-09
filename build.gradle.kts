plugins {
    id("java")
}

group = "io.mzml"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.3"))
    testImplementation(platform("io.cucumber:cucumber-bom:7.20.1"))

    testImplementation("io.cucumber:cucumber-java")
    testImplementation("io.cucumber:cucumber-junit-platform-engine")
    testImplementation("org.junit.platform:junit-platform-suite")
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Test> {
    useJUnitPlatform()
    // Work around. Gradle does not include enough information to disambiguate
    // between different examples and scenarios.
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}