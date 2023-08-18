package com.baggio.configuration

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/greeting")
class HelloController {


    @GetMapping
    fun hello(): String = "hello"

}