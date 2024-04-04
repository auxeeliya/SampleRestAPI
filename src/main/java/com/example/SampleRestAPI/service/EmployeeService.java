package com.example.SampleRestAPI.service;

import com.example.SampleRestAPI.model.Employee;

import java.util.List;

public interface EmployeeService {
    public String addEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public String deleteEmp(Long empId);
    Employee getEmployee(Long id);
}
