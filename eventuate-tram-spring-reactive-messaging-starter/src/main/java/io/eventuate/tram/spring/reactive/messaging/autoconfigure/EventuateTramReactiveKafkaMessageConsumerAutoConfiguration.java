package io.eventuate.tram.spring.reactive.messaging.autoconfigure;

import io.eventuate.tram.consumer.common.MessageConsumerImplementation;
import io.eventuate.tram.spring.reactive.consumer.kafka.EventuateTramReactiveKafkaMessageConsumerConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ConditionalOnMissingBean(MessageConsumerImplementation.class)
@Import(EventuateTramReactiveKafkaMessageConsumerConfiguration.class)
public class EventuateTramReactiveKafkaMessageConsumerAutoConfiguration {
}
