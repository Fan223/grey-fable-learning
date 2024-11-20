package grey.fable.kafka.consumer.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author GreyFable
 * @since 2024/10/24 15:11
 */
//@RestController
public class TestController {

    @KafkaListener(topics = "test", groupId = "grey-fable-group")
    public void listen(ConsumerRecord<String, String> message) {
        System.out.println("接收消息: " + message.value());
    }
}
