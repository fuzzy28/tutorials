package org.jrue.springbooteurekaclient2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SpringbootEurekaClient2Application

fun main(args: Array<String>) {
	runApplication<SpringbootEurekaClient2Application>(*args)
}
