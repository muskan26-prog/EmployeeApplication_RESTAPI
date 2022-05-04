package com.employeeService.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeService.demo.entity.Employee;
import com.employeeService.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployee(List<Employee> employee) {
		return repository.saveAll(employee);
	}
	
	public List<Employee> getEmployee(){
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Employee getEmployeeByName(String name){
		return repository.findByName(name);
	}
	
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "employee removed!! " +id;
	}
	
	public Employee updateEmployee(int id) {
		Employee existingEmployee = repository.findById(id).orElse(null);
		existingEmployee.setSalary(existingEmployee.getSalary()+5000);
		return repository.save(existingEmployee);	
	}
}
