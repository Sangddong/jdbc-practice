plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.zaxxer:HikariCP:5.0.1")
    implementation("org.springframework:spring-jdbc:5.3.22")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation("org.assertj:assertj-core:3.22.0")

    testImplementation("com.h2database:h2:2.1.214")
}

tasks.test {
    useJUnitPlatform()
}