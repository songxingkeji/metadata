package com.sunsheen.metadataserver.kafka;

import com.sunsheen.metadataserver.common.kafka.callback.KafkaSendResultHandler;
import org.apache.kafka.common.errors.TimeoutException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class KafkaCallbackTest {

    @Autowired
    private KafkaSendResultHandler producerListener;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * KafkaTemplate异步发送消息
     * 使用KafkaSendResultHandler实现消息发送结果回调，这里为什么又要休眠？
     *      发送消息的时候需要休眠一下，否则发送时间较长的时候会导致进程提前关闭导致无法调用回调时间。
     *      主要是因为KafkaTemplate发送消息是采取异步方式发送的
     * KafkaTemplate的源代码
     *      send(String topic, V data)：
     *          调用的发送消息方法，可以看到KafkaTemplate会使用ProducerRecord把我们传递进来的参数再一次封装，
     *          最后调用doSend方法发送消息到Kafka中
     *      ListenableFuture<SendResult<K, V>> doSend(final ProducerRecord<K, V> producerRecord)：
     *          doSend方法先是检测是否开启事务，紧接着使用SettableListenableFuture发送消息，
     *          然后判断是否启动自动冲洗数据到Kafka中
     *      SettableListenableFuture实现了什么接口：
     *          可以看到SettableListenableFuture实现了ListenableFuture接口，ListenableFuture则实现了Future接口，
     *          Future是Java自带的实现异步编程的接口，支持返回值的异步，而我们使用Thread或者Runnable都是不带返回值的。
     *
     * @throws InterruptedException
     */
    @Test
    public void testProducerListen() throws InterruptedException {
        kafkaTemplate.setProducerListener(producerListener);
        kafkaTemplate.send("first", "test producer listen");
        Thread.sleep(1000);
    }

    /**
     * KafkaTemplate同步发送消息
     * KafkaTemplate异步发送消息大大的提升了生产者的并发能力，但某些场景下我们并不需要异步发送消息，这个时候我们可以采取同步发送方式，
     *      实现也是非常简单的，我们只需要在send方法后面调用get方法即可。Future模式中，我们采取异步执行事件，
     *      等到需要返回值得时候我们再调用get方法获取future的返回值
     *
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void testSyncSend() throws ExecutionException, InterruptedException {
        kafkaTemplate.send("topic.quick.demo", "test sync send message").get();
    }

    /**
     * get方法还有一个比较有意思的重载方法，get(long timeout, TimeUnit unit)，当send方法耗时大于get方法所设定的参数时会抛出一个超时异常，
     *      但需要注意，这里仅抛出异常，消息还是会发送成功的。这里的测试方法设置send耗时必须小于 一微秒(那必须得失败呀，嘿嘿嘿)，
     *      运行后我们可以看到抛出的异常，但也发现消息能发送成功并被监听器接收了。
     *      那这功能有什么作用呢，如果还没有接触过SQL慢查询可以去了解一下，使用该方法作为SQL慢查询记录的条件。
     *
     * @throws ExecutionException
     * @throws InterruptedException
     * @throws TimeoutException
     */
    @Test
    public void testTimeOut() throws InterruptedException, ExecutionException, java.util.concurrent.TimeoutException {
        kafkaTemplate.send("topic.quick.demo", "test send message timeout").get(1, TimeUnit.MICROSECONDS);
    }

}
