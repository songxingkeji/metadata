package com.sunsheen.metadataserver.common.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @description: kafka消息消费者
 * @author: zhangxuejiao
 * @createDate: 2019/5/24 13:08
 */
@Slf4j
@Component
public class KafkaReceiver {

    //@KafkaListener(topics = {"first", "second", "third"})
    public void listen(@Payload String message){
        log.info("received message={}", message);
        System.out.println("received message: " + message);
    }
}
