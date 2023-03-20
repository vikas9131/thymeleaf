package com.example1.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.Entity.Employee;

public interface EmployeeService {

	 List<Employee> getAllEmployee();
	 void saveEmployee(Employee employee);
	 //public Employee saveEmployee(Employee employee);
	 boolean getEmployeeByEmail(String email);
	 Employee getById(Long id);
	 void deleteViaId(long id);
}

