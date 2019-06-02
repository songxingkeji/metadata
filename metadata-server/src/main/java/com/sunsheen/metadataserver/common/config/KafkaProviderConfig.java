package com.sunsheen.metadataserver.common.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: kafka生产者配置
 * @author: zhangxuejiao
 * @createDate: 2019/5/24 11:50
 */
/*@Configuration
@EnableKafka*/
public class KafkaProviderConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${spring.kafka.producer.acks}")
    private String acks;

    @Value("${spring.kafka.producer.retries}")
    private String retries;

    @Value("${spring.kafka.producer.batch-size}")
    private String batchSize;

    @Value("${spring.kafka.producer.buffer-memory}")
    private String bufferMemory;

    @Value("${spring.kafka.producer.key-serializer}")
    private String keySerializer;

    @Value("${spring.kafka.producer.value-serializer}")
    private String valueSerializer;

    @Bean
    public Map<String, Object> producerConfig(){
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.ACKS_CONFIG, acks);
        props.put(ProducerConfig.RETRIES_CONFIG, retries);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, batchSize);
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, bufferMemory);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, keySerializer);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, valueSerializer);
        return props;
    }

    @Bean
    public ProducerFactory<Integer, String> producerFactory(){
        return new DefaultKafkaProducerFactory<>(producerConfig());
    }

    /**
     * @Primary 注解的意思是在拥有多个同类型的Bean时优先使用该Bean，到时候方便我们使用@Autowired注解自动注入
     * @return
     */
    @Bean
    @Primary
    public KafkaTemplate<Integer, String> kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory());
    }

    /**
     * 使用sendDefault发送消息
     * @return
     */
    @Bean("defaultKafkaTemplate")
    public KafkaTemplate<Integer, String> defaultKafkaTemplate() {
        KafkaTemplate template = new KafkaTemplate<>(producerFactory());
        template.setDefaultTopic("first");
        return template;
    }
}
