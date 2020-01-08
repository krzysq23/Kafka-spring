package com.kafka.consumer;

import java.util.Optional;
import java.util.concurrent.CountDownLatch;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	private final CountDownLatch latch1 = new CountDownLatch(1);
	
	@KafkaListener(topics = { "test" })
	public void listen(ConsumerRecord<?, ?> record) {

		Optional<?> kafkaMessage = Optional.ofNullable(record.value());

		if (kafkaMessage.isPresent()) {

			Object message = kafkaMessage.get();
			System.out.println("---->" + record);
			System.out.println("---->" + message);

		}

	}
    
	@KafkaListener(id = "foo", topics = "annotated1")
	public void listen1(String foo) {
		this.latch1.countDown();
	}
    
}