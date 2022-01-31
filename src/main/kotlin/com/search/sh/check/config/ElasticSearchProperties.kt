package com.search.sh.check.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "elasticsearch")
class ElasticSearchProperties(
        private val host: String,
        private val port: Integer
) {
    fun getHostAndPort(): String {
        return "$host:$port"
    }
}