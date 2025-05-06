package com.project.demo.controller;

import com.project.demo.entity.Employee;
import com.project.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;
    @PostMapping("/register")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeServiceImpl.createEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployeees()
    {
        return employeeServiceImpl.getAllEmployees();
    }

    @PutMapping("/update/{id}")
    public Employee update(@PathVariable String id , @RequestBody Employee employee)
    {
        return employeeServiceImpl.updateEmployee(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public Employee delete(@PathVariable String id)
    {
        return employeeServiceImpl.delete(id);
    }
}
