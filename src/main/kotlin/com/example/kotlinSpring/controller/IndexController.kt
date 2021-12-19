package com.example.kotlinSpring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @GetMapping("get")
    fun index(): String = "Привет"
}