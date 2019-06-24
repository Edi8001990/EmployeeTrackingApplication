package com.codeclan.example.employeeTracker;

import com.codeclan.example.employeeTracker.Repositories.EmployeeRepository;
import com.codeclan.example.employeeTracker.models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackerApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("Bob", 32, 1, "bob@gmail.com");
		Employee employee2 = new Employee("John", 28, 2, "john@gmail.com");
		Employee employee3 = new Employee("Paul", 25, 3, "paul@gmail.com");
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}

}
