package grey.fable.kafka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * Kafka 生产者启动类.
 *
 * @author GreyFable
 * @since 2024/10/24 14:47
 */
@SpringBootApplication
@EnableKafka
public class KafkaProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }
}
