package com.learning.employees.repo;

import com.learning.employees.Entity.Employee;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    @Query(value = "SELECT * FROM EMPLOYEE")
    List<Employee> getEmployees();
}
