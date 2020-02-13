package com.example.demospringcloudkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author owner
 *
 */
@SpringBootApplication
@EnableBinding(Processor.class)
@EnableSwagger2
public class DemoSpringCloudKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudKafkaApplication.class, args);
	}

}
