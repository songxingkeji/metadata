package com.sunsheen.metadataserver.kafka;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class KafkaSendTest {

    @Resource
    private KafkaTemplate defaultKafkaTemplate;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 这里调用的是sendDefault方法，而且并没有在方法参数上添加topicName，
     *      这是因为我们在声明defaultKafkaTemplate这个Bean的时候添加了这行代码 template.setDefaultTopic("topic.quick.default")，
     *      只要调用sendDefault方法，kafkaTemplate会自动把消息发送到名为"topic.quick.default"的Topic中
     * 注意两点：
     *      1.必须用@Resource注解
     *      2.@Bean("defaultKafkaTemplate")与defaultKafkaTemplate对应
     */
    @Test
    public void testDefaultKafkaTemplate() {
        defaultKafkaTemplate.sendDefault("I send 哈哈哈 to default topic");
    }

    @Test
    public void testTemplateSend() {
        // 发送带有时间戳的消息
        //kafkaTemplate.send("first", 0, System.currentTimeMillis(), 0, "send message with timestamp");

        // 使用ProducerRecord发送消息
        /*ProducerRecord record = new ProducerRecord("first", "use ProducerRecord to send message");
        kafkaTemplate.send(record);*/

        // 使用Message发送消息
        Map map = new HashMap();
        map.put(KafkaHeaders.TOPIC, "first");
        map.put(KafkaHeaders.PARTITION_ID, 0);
        map.put(KafkaHeaders.MESSAGE_KEY, 0);
        GenericMessage message = new GenericMessage("use Message to send message",new MessageHeaders(map));
        kafkaTemplate.send(message);
    }
}

