package com.atguigu.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = {"custome_test"},groupId = "test-consumer-group", containerFactory="kafkaListenerContainerFactory")
    public void kafkaListener(String message){
        System.out.println(message);
    }

}