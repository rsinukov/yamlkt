object Versions {
    const val version = "0.10.2"

    const val kotlin = "1.5.31"
    const val serialization = "1.3.0"

    const val mavenCentralPublish = "1.0.0-dev-3"
}

@Suppress("unused")
fun kotlinx(id: String, version: String) = "org.jetbrains.kotlinx:kotlinx-$id:$version"