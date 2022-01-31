package com.search.sh.check

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class CheckApplication

fun main(args: Array<String>) {
	runApplication<CheckApplication>(*args)
}