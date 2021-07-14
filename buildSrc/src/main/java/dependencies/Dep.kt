package dependencies

class Dep {
    object GradlePlugin {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10"
        const val forge = "net.minecraftforge.gradle:ForgeGradle:4.1.12"
    }

    object Kotlin {
        const val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.10"
    }

    object Minecraft {
        /// 対象のminecraftバージョン. forge と 合わせる
        const val version = "1.16.5"
        const val channel = "official"
    }

    object MinecraftForge {
        /// 対応させるforgeのバージョン.
        const val version = "net.minecraftforge:forge:1.16.5-36.1.32"
    }
}
