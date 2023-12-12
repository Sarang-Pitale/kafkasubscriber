package com.example.kafkasubscriber.service;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaMsgSubscriber {
    //Logger log= LoggerFactory.getLogger(KafkaMessageListener.class)
    @KafkaListener(topics="payment",groupId = "t1")
    public void consume(String msg)
    {
        System.out.println("Consumed the message1:"+msg);
    }
    @KafkaListener(topics="payment",groupId = "t1")
    public void consume1(String msg)
    {
        System.out.println("Consumed the message2:"+msg);
    }
    @KafkaListener(topics="payment",groupId = "t1")
    public void consume2(String msg)
    {
        System.out.println("Consumed the message3:"+msg);
    }

}
