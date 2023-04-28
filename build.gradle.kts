plugins {
	id("org.springframework.boot") version "2.7.11"
	id("io.spring.dependency-management") version "1.1.0"
	id("java")
}

group = "com.mcbanners"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(17))
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(platform("org.springframework.cloud:spring-cloud-dependencies:2021.0.7"))

	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
}

tasks {
	bootJar {
		archiveFileName.set("eureka.jar")
	}
}
