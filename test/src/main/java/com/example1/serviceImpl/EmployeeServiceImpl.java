package com.example1.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.Entity.Employee;
import com.example1.Repository.EmployeeRepository;
import com.example1.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
	 EmployeeRepository employeeRepository;
	 
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override public Employee getById(Long id)
    {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return employee;
    }

	@Override
	public void deleteViaId(long id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public boolean getEmployeeByEmail(String email) {
		
		if(employeeRepository.findByEmail(email))
			return true;
		
		return false;
	}

	
	
}
