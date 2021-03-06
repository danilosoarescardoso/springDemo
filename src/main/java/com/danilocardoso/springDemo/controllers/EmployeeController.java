package com.danilocardoso.springDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.danilocardoso.springDemo.domains.Employee;
import com.danilocardoso.springDemo.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeController (EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@PostMapping("/employees")
	@ResponseStatus(HttpStatus.CREATED)
	public void addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}

}
