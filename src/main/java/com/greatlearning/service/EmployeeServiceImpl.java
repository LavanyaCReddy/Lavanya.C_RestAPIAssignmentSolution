package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.data.Employee;

import com.greatlearning.payloads.EmployeeRequest;
import com.greatlearning.payloads.MessageResponse;
import com.greatlearning.repo.EmployeeRepository;



@Service
public abstract class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    EmployeeRepository employeeRepository;
	

    @Override
    public MessageResponse createEmployee(EmployeeRequest employeeRequest) {
        Employee newEmployee = new Employee();
        newEmployee.setFirstname(employeeRequest.getFirstname());
        newEmployee.setLastname(employeeRequest.getLastname());
        newEmployee.setEmail(employeeRequest.getEmail());
        employeeRepository.save(newEmployee);
        return new MessageResponse("New Employee created successfully");

    }
    
    @Override
    public Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest){
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        employeeRepository.save(employee.get());
        return employee;
    }
  


	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
		
	}

	public Employee findById(int theId) {
		return employeeRepository.findById(theId).get();
	}

	
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);

	}


	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);


	}

	public List<Employee> searchBy(String firstname, String email) {
		List<Employee> employees=employeeRepository.findByFirstnameContainsAndEmailContainsAllIgnoreCase(firstname, email);
		return employees;
	}

}
