package org.jrue.kafka.springbootkafkaproducer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BookResource {

    private static final String TOPIC = "Books";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/{message}")
    public String sendMessage(@PathVariable String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Published successfully!";
    }


}
