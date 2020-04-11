package org.jrue.springbootconfigclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class PropertyConsumerResource {

    @Value("${app.message: Default message}")
    private String message;

    @GetMapping
    public String getProperty() {
        return message;
    }

}
