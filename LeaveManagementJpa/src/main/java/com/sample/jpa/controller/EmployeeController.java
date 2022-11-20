package com.sample.jpa.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.jpa.entity.Employee;
import com.sample.jpa.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/employee/insert")
	public String insertEmployee(@RequestBody Employee employee) {
		String str = "Unable to upload Employee";
		Employee emp = employeeRepository.save(employee);
		if(emp != null) {
			str = "Employee Details uploaded";
		}
		return str;
		
	}
	@Transactional
	@DeleteMapping("/employee/delete/{id}")
	public void deleteEmployeeDetails(@PathVariable("id") int id) {
		employeeRepository.deleteById(id);
		
	}
}
