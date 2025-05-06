package com.project.demo.serviceimpl;

import com.project.demo.entity.Employee;
import com.project.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> a1 =new ArrayList<>();

    @Override
    public Employee createEmployee(Employee employee) {
        a1.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return a1;
    }

    @Override
    public Employee updateEmployee(String id, Employee employee) {
        for(Employee e : a1)
        {
            if(e.getId().equals(id))
            {
                e.setName(employee.getName());
                return e;
            }
        }

        return null;
    }

    @Override
    public Employee delete(String id) {

        for(Employee e : a1)
        {
            if(e.getId().equals(id))
            {
                a1.remove(e);
                return e;
            }
        }

        return null;
    }
}
