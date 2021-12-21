package com.bendeliani

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwsApp

fun main(args: Array<String>) {

    runApplication<AwsApp>(*args)
}
