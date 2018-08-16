package ru.madzi.apps.nlp.ms.routes

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get

fun Routing.healthCheck() {
    get("/health_check") {
        call.respondText("OK")
    }
}
