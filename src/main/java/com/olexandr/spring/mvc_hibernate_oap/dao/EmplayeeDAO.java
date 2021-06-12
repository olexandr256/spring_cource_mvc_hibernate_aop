package com.olexandr.spring.mvc_hibernate_oap.dao;

import com.olexandr.spring.mvc_hibernate_oap.entity.Employee;

import java.util.List;

public interface EmplayeeDAO {
    public List<Employee> getAllEmplayees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
