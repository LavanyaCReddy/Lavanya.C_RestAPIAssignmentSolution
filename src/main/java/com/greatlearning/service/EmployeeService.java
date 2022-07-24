package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.greatlearning.data.Employee;

import com.greatlearning.payloads.EmployeeRequest;
import com.greatlearning.payloads.MessageResponse;


@Service
public interface EmployeeService {
	MessageResponse createEmployee(EmployeeRequest employeeRequest);
	
	Optional<Employee>  updateEmployee(Integer employeeId, EmployeeRequest employeeRequest);
    
    void deleteEmployee(Integer employeeId);
    
    Employee getASingleEmployee(Integer employeeId);
    
    List<Employee> getAllEmployee();

	Employee findById(int theId);

	void save(Employee theEmployee);

	void deleteById(int theId);

	List<Employee> searchBy(String firstname, String email);
}
	
   




