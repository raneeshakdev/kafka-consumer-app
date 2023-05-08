package com.rak.reference.kafka.consumer.app.service;

import com.rak.reference.kafka.consumer.app.bean.Item;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ItemConsumer {

    @KafkaListener(topics = "test-topic", groupId = "item-group-id")
    public void listenItemEvent(Item item) {
        System.out.println("Received message: " + item);
    }
}
