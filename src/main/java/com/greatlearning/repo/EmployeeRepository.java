package com.greatlearning.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.data.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByFirstnameContainsAndEmailContainsAllIgnoreCase(String firstname,String email);

}
