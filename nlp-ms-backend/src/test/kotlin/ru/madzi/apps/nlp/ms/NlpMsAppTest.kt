package ru.madzi.apps.nlp.ms

import io.ktor.application.Application
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NlpMsAppTest {
    @Test fun testRouting() {
        withTestApplication(Application::module) {
            with(handleRequest(HttpMethod.Get, "/word/ABC")) {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Unknown(ABC)", response.content)
            }

            with(handleRequest(HttpMethod.Get, "/health_check")) {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("OK", response.content)
            }
        }
    }
}