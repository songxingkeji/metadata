package com.sunsheen.metadataserver.common.kafka.callback;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

/**
 * @description: 消息结果回调
 * @author: zhangxuejiao
 * @createDate: 2019/5/24 18:03
 */
@Slf4j
@Component
public class KafkaSendResultHandler implements ProducerListener {

    /**
     * KafkaTemplate发送消息成功的时候回调用OnSuccess方法
     * @param producerRecord
     * @param recordMetadata
     */
    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {
        log.info("Message send success : " + producerRecord.toString());
    }

    /**
     * 发送失败则会调用onError方法
     * @param producerRecord
     * @param exception
     */
    @Override
    public void onError(ProducerRecord producerRecord, Exception exception) {
        log.info("Message send error : " + producerRecord.toString());
    }
}
