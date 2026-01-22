package com.learning.employees.service.Impl;

import com.learning.employees.Entity.Employee;
import com.learning.employees.repo.EmployeeRepo;
import com.learning.employees.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    @Override
    public List<Employee> findEmployees() {
        return employeeRepo.getEmployees();
    }
}
