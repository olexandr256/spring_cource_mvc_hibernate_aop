package com.olexandr.spring.mvc_hibernate_oap.service;

import com.olexandr.spring.mvc_hibernate_oap.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
