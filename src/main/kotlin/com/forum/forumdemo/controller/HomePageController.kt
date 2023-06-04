package com.forum.forumdemo.controller

import com.forum.forumdemo.response.WeatherResponse
import com.forum.forumdemo.service.WeatherService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomePageController(private val weatherService: WeatherService) {
    @GetMapping("/")
    fun home(): String {
        return "homePage"
    }

    @GetMapping("/weather")
    fun weather(): WeatherResponse = weatherService.getWeather("Paris", "d3c80ddc93fd4e06ae072450230406")


    @GetMapping("/kk")
    fun a(): String {
        return "lll"
    }
}
