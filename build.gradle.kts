plugins {
    java
    kotlin("jvm") version "1.4.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClassName = "com.example.h4k.AppKt"
}

dependencies {
    implementation(platform("org.http4k:http4k-bom:3.258.0"))
    implementation("org.http4k:http4k-core")
//    implementation("org.http4k:http4k-server-jetty")
    implementation("org.http4k:http4k-server-netty")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.6.0")

}
