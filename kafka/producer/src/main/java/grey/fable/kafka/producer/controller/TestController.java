package grey.fable.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GreyFable
 * @since 2024/10/24 15:07
 */
@RestController
public class TestController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public TestController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/test")
    public void test() {
        for (int i = 0; i < 22; i++) {
            kafkaTemplate.send("test", "test" + i);
        }
        // 确保所有消息都被发送
        kafkaTemplate.flush();
    }
}
