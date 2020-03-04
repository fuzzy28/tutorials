package org.jrue.kafka.springbootkafkaproducer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookResource {

    private static final String TOPIC = "Books";

    @Autowired
    private KafkaTemplate<String, Book> kafkaTemplate;

    @PostMapping()
    public String sendMessage(@RequestBody Book book) {
        kafkaTemplate.send(TOPIC, book);
        return "Published successfully!";
    }


}
