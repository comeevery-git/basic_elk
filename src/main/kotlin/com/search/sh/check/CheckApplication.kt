package com.search.sh.check

import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@Slf4j
@SpringBootApplication
@ConfigurationPropertiesScan
class CheckApplication

private val logger: Logger = LoggerFactory.getLogger(CheckApplication::class.java)

fun main(args: Array<String>) {
	runApplication<CheckApplication>(*args)

	// logstash test data
	var i = 0
	while (i <= 10) {
		logger.info("test_log '$i'")
		i++
	}
}