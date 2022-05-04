package com.employeeService.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeService.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	Employee findByName(String name);
}
