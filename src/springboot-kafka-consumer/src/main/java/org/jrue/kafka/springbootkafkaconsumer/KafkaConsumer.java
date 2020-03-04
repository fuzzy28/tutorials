package org.jrue.kafka.springbootkafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Books", groupId = "group_id")
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}
