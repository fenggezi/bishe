package com.bishe.lr.service;

import com.bishe.lr.entities.Employee;


import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Integer id);

    void insertEmp(Employee employee);

    void updateEmp(Employee employee);

    void deleteEmp(Integer id);
}
