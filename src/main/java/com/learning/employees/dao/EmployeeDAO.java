package com.learning.employees.dao;

import com.learning.employees.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
