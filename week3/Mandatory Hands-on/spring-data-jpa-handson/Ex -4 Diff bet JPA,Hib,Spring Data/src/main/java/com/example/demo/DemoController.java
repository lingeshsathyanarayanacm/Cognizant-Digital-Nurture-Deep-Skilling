package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class DemoController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "Employee added successfully";
    }
}
