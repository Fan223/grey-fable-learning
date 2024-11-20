package grey.fable.kafka.consumer.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author GreyFable
 * @since 2024/10/26 0:49
 */
@RestController
public class BatchController {

    @KafkaListener(topics = "test", groupId = "grey-fable-group", batch = "true")
    public void listen(List<ConsumerRecord<String, String>> messages) {
        for (ConsumerRecord<String, String> message : messages) {
            System.out.println("接收消息: " + message.value());
        }
        System.out.println("================================");
    }
}
