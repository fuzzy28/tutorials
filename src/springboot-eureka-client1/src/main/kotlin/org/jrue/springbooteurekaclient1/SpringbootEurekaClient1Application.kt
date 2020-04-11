package org.jrue.springbooteurekaclient1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SpringbootEurekaClient1Application

fun main(args: Array<String>) {
	runApplication<SpringbootEurekaClient1Application>(*args)
}
