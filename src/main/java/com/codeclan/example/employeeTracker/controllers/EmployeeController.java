package com.codeclan.example.employeeTracker.controllers;


import com.codeclan.example.employeeTracker.Repositories.EmployeeRepository;
import com.codeclan.example.employeeTracker.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

}
