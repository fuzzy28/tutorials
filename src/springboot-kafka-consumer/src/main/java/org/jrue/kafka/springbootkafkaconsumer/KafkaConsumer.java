package org.jrue.kafka.springbootkafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Books", groupId = "group_string")
    public void consumeStringMessage(String message) {
        System.out.println("Consumed String message: " + message);
    }

    @KafkaListener(topics = "Books_Json", groupId = "group_json", containerFactory = "jsonListenerContainerFactory")
    public void consumeJsonMessage(Book book) {
        System.out.println("Consumed book: " + book);
    }
}
