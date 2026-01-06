plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("OpenAPI 3.0 Pet Store")
                description.set("This is a sample Pet Store Server based on the OpenAPI 3.0 specification.")
                url.set("https://www.github.com/stainless-sdks/pioneer-intergration-app-kotlin")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Pioneer Intergration App")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/pioneer-intergration-app-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/pioneer-intergration-app-kotlin.git")
                    url.set("https://github.com/stainless-sdks/pioneer-intergration-app-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
