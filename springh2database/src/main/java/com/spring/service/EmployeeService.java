package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Optional<Employee> getEmployeeById(Long employeeId);

	Employee createEmployee(Employee employee);	

	Employee updateEmployee(Employee employeeDetails);

	void deleteEmployee(Employee employee);

}
