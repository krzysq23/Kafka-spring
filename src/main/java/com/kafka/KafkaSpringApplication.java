package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.kafka" } )
public class KafkaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringApplication.class, args);
	}
	  
}