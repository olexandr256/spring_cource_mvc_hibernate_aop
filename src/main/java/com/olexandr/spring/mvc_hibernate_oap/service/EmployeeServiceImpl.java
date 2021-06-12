package com.olexandr.spring.mvc_hibernate_oap.service;

import com.olexandr.spring.mvc_hibernate_oap.dao.EmplayeeDAO;
import com.olexandr.spring.mvc_hibernate_oap.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmplayeeDAO emplayeeDAO;

    @Override
    @Transactional//для автоматичного контроню сесії - закриття та відкриття
    public List<Employee> getAllEmployees() {
        return emplayeeDAO.getAllEmplayees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        emplayeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return emplayeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        emplayeeDAO.deleteEmployee(id);
    }


}
