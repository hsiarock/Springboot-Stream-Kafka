package com.example.demospringcloudkafka.producer;

import com.example.demospringcloudkafka.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 *
 * @author owner
 *
 */
@Service
@Slf4j
public class AvroProducer {

    @Autowired
    private Processor processor;

    public void produceEmployeeDetails(int empId, String firstName, String lastName) {

        // creating employee details
        Employee employee = Employee.builder().id(empId)
        .firstName(firstName)
        .lastName(lastName)
        .department("IT")
        .designation("Engineer")
        .build();

        log.info("Build Employ now...");

        Message<Employee> message = MessageBuilder.withPayload(employee)
        		.build();

        processor.output().send(message);
    }
}
