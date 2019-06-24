package com.codeclan.example.employeeTracker.Repositories;


import com.codeclan.example.employeeTracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
