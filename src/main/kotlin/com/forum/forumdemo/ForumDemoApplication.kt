package com.forum.forumdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ForumDemoApplication

fun main(args: Array<String>) {
    runApplication<ForumDemoApplication>(*args)
}
