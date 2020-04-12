package org.jrue.springbooteurekaclient1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableEurekaClient
class SpringbootEurekaClient1Application

fun main(args: Array<String>) {

	runApplication<SpringbootEurekaClient1Application>(*args)
}
