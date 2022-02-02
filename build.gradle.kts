import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.3"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
	// 	kotlin & lombok = experimental
	kotlin("plugin.lombok") version "1.6.10"
	id("io.freefair.lombok") version "5.3.0"
}

group = "com.search.sh"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	// spring-data-elasticsearch
	implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
	// logstash-logback-encoder
	implementation("net.logstash.logback:logstash-logback-encoder:5.3")
	// logback
	implementation("org.slf4j:jcl-over-slf4j")
	implementation("ch.qos.logback:logback-classic")

	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
