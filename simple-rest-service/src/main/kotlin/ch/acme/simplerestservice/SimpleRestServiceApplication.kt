package ch.acme.simplerestservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SimpleRestServiceApplication

fun main(args: Array<String>) {
    runApplication<SimpleRestServiceApplication>(*args)
}
