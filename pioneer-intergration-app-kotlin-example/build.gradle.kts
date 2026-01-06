plugins {
    id("pioneer-intergration-app.kotlin")
    application
}

dependencies {
    implementation(project(":pioneer-intergration-app-kotlin"))
}

application {
    // Use `./gradlew :pioneer-intergration-app-kotlin-example:run` to run `Main`
    // Use `./gradlew :pioneer-intergration-app-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.pioneer_intergration_app.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
