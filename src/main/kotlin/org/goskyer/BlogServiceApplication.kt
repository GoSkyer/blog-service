package org.goskyer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BlogServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(BlogServiceApplication::class.java, *args)
}
