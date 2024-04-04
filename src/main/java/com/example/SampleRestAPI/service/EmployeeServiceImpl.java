package com.example.SampleRestAPI.service;

import com.example.SampleRestAPI.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.SampleRestAPI.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public String deleteEmp(Long empId) {
        employeeRepository.deleteById(empId);
        return "Employee deleted";
    }

    @Override
    public Employee getEmployee(Long empId) {
        return employeeRepository.findById(empId).get();
    }
}
