plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.junit:junit-bom:5.10.0"))
    implementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation("org.assertj:assertj-core:3.24.2")
    implementation("net.datafaker:datafaker:2.4.2")
}

tasks.test {
    useJUnitPlatform()
}