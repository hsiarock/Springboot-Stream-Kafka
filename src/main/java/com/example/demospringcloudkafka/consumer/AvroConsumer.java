package com.example.demospringcloudkafka.consumer;

import com.example.demospringcloudkafka.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

/**
 *
 * @author owner
 *
 */
@Service
@Slf4j
public class AvroConsumer {

    @StreamListener(Processor.INPUT)
    public void consumeEmployeeDetails(Employee employeeDetails) {
        log.info("Let's process employee details: {}", employeeDetails);
    }
}
