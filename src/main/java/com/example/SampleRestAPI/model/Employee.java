package com.example.SampleRestAPI.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;
}
