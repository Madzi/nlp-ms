package ru.madzi.apps.nlp.ms.routes

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get
import ru.madzi.apps.nlp.core.WordFactory

fun Routing.word() {
    get("/word/{word}") {
        val command = call.parameters["word"]
        call.respondText(if (command != null) WordFactory.parse(command).stringify() else "???")
    }
}
