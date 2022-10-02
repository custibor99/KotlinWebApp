package com.example.demo.controler

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

class Ping(){
    companion object {
        var counter = 0

        fun getPingCounter():Int {
            counter++
            return counter
        }
    }
}

@RestController
@RequestMapping("api/v1/")
class UtilityController {

    @GetMapping("ping")
    fun ping(): Int{
        return Ping.getPingCounter()
    }
}