package org.jrue.springbooteurekaclient1

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class BeanConfig {

    @Bean
    @LoadBalanced
    fun createRestTemplate(builder: RestTemplateBuilder) : RestTemplate {
        return builder.build();
    }
}