package com.example.demospringcloudkafka.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author owner
 *
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Employee {

    int id;
    String firstName;
    String lastName;
    String department;
    String designation;

}
