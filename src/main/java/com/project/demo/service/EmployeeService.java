package com.project.demo.service;

import com.project.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee updateEmployee(String id, Employee employee);

    Employee delete(String id);
}
