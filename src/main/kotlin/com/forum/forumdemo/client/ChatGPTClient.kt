package com.forum.forumdemo.client

import com.forum.forumdemo.feignClient.ChatGPTFeignClient
import com.forum.forumdemo.`object`.ChatRequest
import org.springframework.stereotype.Component

private const val GPT_HEADER = "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"

@Component
class ChatGPTClient(private val chatGPTFeignClient: ChatGPTFeignClient) {
    fun sendMsg(chatRequest: ChatRequest): String =
        chatGPTFeignClient.sendMsg(GPT_HEADER, chatRequest).choices.map { it.message.content }.last()
}