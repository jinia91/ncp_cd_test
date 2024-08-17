package com.network.ncp_cd_test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloNcpController {
    @GetMapping("/hello")
    fun test() : String {
        return "Hello NCP"
    }

    @GetMapping("/hello2")
    fun test2() : String {
        return "Hello NCP2"
    }
}