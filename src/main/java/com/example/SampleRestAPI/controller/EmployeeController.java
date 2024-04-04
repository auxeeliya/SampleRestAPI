package com.example.SampleRestAPI.controller;

import com.example.SampleRestAPI.service.EmployeeService;
import com.example.SampleRestAPI.model.Employee;
import com.example.SampleRestAPI.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService empservice;

    @PostMapping("/addEmp")
    public String addEmployee(@RequestBody Employee employee){
        return empservice.addEmployee(employee);
    }

    @GetMapping("/getAllEmp")
    public List<Employee> getAllEmployee(){
        return empservice.getAllEmployee();
    }

    @GetMapping("/getEmp/{empId}")
    public Employee getEmployee(@PathVariable Long empId){
        return empservice.getEmployee(empId);
    }

    @DeleteMapping("/deleteEmp/{empId}")
    public String deleteEmp(@PathVariable Long empId){
        return empservice.deleteEmp(empId);
    }
}
