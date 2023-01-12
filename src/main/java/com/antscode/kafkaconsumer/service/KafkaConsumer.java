package com.antscode.kafkaconsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consume(String message) {
        log.info("Received message {} ", message);
    }
}
