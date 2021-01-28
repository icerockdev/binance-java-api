plugins {
    `java`
    `maven-publish`
}

group = "com.binance.api"
version = "1.1.0"

repositories {
    jcenter()
}

dependencies {
    val retrofitVersion = "2.4.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-jackson:$retrofitVersion")
    implementation("commons-codec:commons-codec:1.10")
    implementation("org.apache.commons:commons-lang3:3.6")

    testImplementation("junit:junit:4.12")
}

publishing {
    publications {
        register("maven", MavenPublication::class) {
            from(components["java"])
        }
    }
}
