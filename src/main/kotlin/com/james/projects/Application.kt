package com.james.projects

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.james.projects.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureTemplating()
        configureSerialization()
        configureSockets()
    }.start(wait = true)
}
