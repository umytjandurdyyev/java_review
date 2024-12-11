package com.cydeo.task.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumber;
}
