package com.example.physicsapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import sun.security.util.math.IntegerModuloP

@RestController
@RequestMapping("/api")
class MainApiController {
    @GetMapping("/plus")
    fun plus(
            @RequestParam("num1") num1: Int,
            @RequestParam("num2") num2: Int
    ): Any {
        data class Plus(
                val result: Int
        )

        return Plus(
                result = num1 + num2
        )
    }
}