package com.learning.employees.controller;

import com.learning.employees.Entity.Employee;
import com.learning.employees.dao.EmployeeDAO;
import com.learning.employees.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {

    private final EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO employeeDAO, EmployeeService employeeService) {
        this.employeeDAO = employeeDAO;
        this.employeeService = employeeService;
    }

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
//        return employeeService.findEmployees();
        return employeeDAO.findAll();
    }

}
