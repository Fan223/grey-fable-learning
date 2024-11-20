package grey.fable.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * Kafka 消费者启动类.
 *
 * @author GreyFable
 * @since 2024/10/24 15:06
 */
@SpringBootApplication
@EnableKafka
public class KafkaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }
}
