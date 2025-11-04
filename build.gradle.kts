plugins {
    alias(libs.plugins.java.library)
    alias(libs.plugins.maven.publish)
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(17)
    withSourcesJar()
}

dependencies {
    compileOnly(project(":stub"))
}

mavenPublishing {
    publishToMavenCentral(automaticRelease = false)
    signAllPublications()

    coordinates(
        groupId = "io.github.vova7878",
        artifactId = "AndroidMisc",
        version = project.version.toString()
    )

    pom {
        name.set("AndroidMisc")
        description.set("Does my code run on Android? And on which version?")
        inceptionYear.set("2025")
        url.set("https://github.com/vova7878/AndroidMisc")

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/license/mit")
                distribution.set("repository")
            }
        }

        developers {
            developer {
                id.set("vova7878")
                name.set("Vladimir Kozelkov")
                url.set("https://github.com/vova7878")
            }
        }

        scm {
            url.set("https://github.com/vova7878/AndroidMisc")
            connection.set("scm:git:git://github.com/vova7878/AndroidMisc.git")
            developerConnection.set("scm:git:ssh://git@github.com/vova7878/AndroidMisc.git")
        }
    }
}
