/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.dhatim.java-conventions")
}

dependencies {
    api("com.fasterxml:aalto-xml:1.3.2")
    api("org.apache.commons:commons-compress:1.22")
    testImplementation("org.apache.poi:poi-ooxml:5.2.3")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.2")
    testImplementation("org.apache.logging.log4j:log4j-core:2.19.0")
}

description = "Fastexcel Reader"

java {
    withJavadocJar()
}