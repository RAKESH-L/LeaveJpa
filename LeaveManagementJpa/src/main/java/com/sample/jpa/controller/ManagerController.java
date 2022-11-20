package com.sample.jpa.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.jpa.entity.Manager;
import com.sample.jpa.repository.LeaveRepository;
import com.sample.jpa.repository.ManagerRepository;

@RestController
@RequestMapping("/api")
public class ManagerController {

	@Autowired
	private ManagerRepository managerRepository;
	
	@Autowired
	private LeaveRepository leaveRepository;
	
	@PostMapping("/manager/insert")
	public String insertManager(@RequestBody Manager manager) {
		String str = "Unable to upload Manager";
		Manager m = managerRepository.save(manager);
		if(m != null) {
			str = "Manager details Uploaded";
		}
		return str;	
	}
	@Transactional
	@PutMapping("/manager/employee/leave/{status}/{id}")
	public String updateEmployeeLeave(@PathVariable("id") Long id, @PathVariable("status") String status) {
		String str = "unable to update leave";
		
		int res = leaveRepository.updateEmployeeLeaveStatus(id, status);
		if(res > 0) {
			str ="Leave status updated";
		}
		return str;
	}
}
