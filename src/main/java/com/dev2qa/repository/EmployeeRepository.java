package com.dev2qa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev2qa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	List<Employee> findByUserName(String userName);

}
