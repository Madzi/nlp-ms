package ru.madzi.apps.nlp.ms

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.Compression
import io.ktor.features.DefaultHeaders
import io.ktor.locations.Locations
import io.ktor.routing.Routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import ru.madzi.apps.nlp.ms.routes.healthCheck
import ru.madzi.apps.nlp.ms.routes.root
import ru.madzi.apps.nlp.ms.routes.word

fun Application.module() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Locations)
    install(Compression)
    install(Routing) {
        root()
        word()
        healthCheck()
    }
}

fun main(args: Array<String>) {
    embeddedServer(Netty, 8080) {
        module()
    }.start(wait = true)
}
