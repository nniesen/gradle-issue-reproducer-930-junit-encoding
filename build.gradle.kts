plugins {
    groovy
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.apache.groovy:groovy:4.0.15")
    testImplementation("org.spockframework:spock-core:2.3-groovy-4.0")
    testImplementation("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
