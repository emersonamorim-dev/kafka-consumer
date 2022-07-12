package com.codev.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerCepEnd {

    private final Logger logger = LoggerFactory.getLogger(ConsumerCepEnd.class);


    @KafkaListener(topics = "${topic.cep-end}", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed Message -> %s", message));
    }
}