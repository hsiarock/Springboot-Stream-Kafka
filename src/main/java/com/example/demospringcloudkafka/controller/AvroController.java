package com.example.demospringcloudkafka.controller;

import com.example.demospringcloudkafka.producer.AvroProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author owner
 *
 */
@RestController
@Slf4j
public class AvroController {

    @Autowired
    private AvroProducer avroProducer;

    @PostMapping("/employees/{id}/{firstName}/{lastName}")
    public String producerAvroMessage(@PathVariable int id, @PathVariable String firstName,
    		@PathVariable String lastName) {

    	log.info("Get POST - set Employee recrod");
        avroProducer.produceEmployeeDetails(id, firstName, lastName);
        return "Sent employee details to consumer";
    }

}
