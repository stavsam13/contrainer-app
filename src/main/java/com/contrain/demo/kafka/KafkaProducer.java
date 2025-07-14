package com.contrain.demo.kafka;

import com.contrain.demo.events.NewRegistrationEvent;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaProducer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
    private static final String TOPIC = "customer-events";
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void publishUserRegistration(NewRegistrationEvent newRegistrationEvent) {
        logger.info("Publishing New Registration Event: {}", newRegistrationEvent);
        kafkaTemplate.send(TOPIC, newRegistrationEvent);
    }
}
