package com.forum.forumdemo.controller

import com.forum.forumdemo.`object`.ChatRequest
import com.forum.forumdemo.`object`.ChatResponse
import com.forum.forumdemo.response.WeatherResponse
import com.forum.forumdemo.service.ChatService
import com.forum.forumdemo.service.WeatherService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomePageController(
    private val weatherService: WeatherService,
    private val chatService: ChatService
) {
    @GetMapping("/")
    fun home(): String {
        return "homePage"
    }

    @GetMapping("/weather")
    fun weather(): WeatherResponse = weatherService.getWeather("Paris", "d3c80ddc93fd4e06ae072450230406")

    @PostMapping("/chat")
    fun chat(
        @RequestBody chatRequest: ChatRequest
    ): String = chatService.sendMsg(chatRequest)
}
