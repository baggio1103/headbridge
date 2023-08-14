package com.baggio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoStartersApplication

fun main(args: Array<String>) {
    runApplication<DemoStartersApplication>(*args)
}
