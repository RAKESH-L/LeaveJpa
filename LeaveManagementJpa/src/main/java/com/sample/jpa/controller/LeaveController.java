package com.sample.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.jpa.dto.LeaveDto;
import com.sample.jpa.entity.Employee;
import com.sample.jpa.entity.Leave;
import com.sample.jpa.repository.EmployeeRepository;
import com.sample.jpa.repository.LeaveRepository;

@RestController
@RequestMapping("/api")
public class LeaveController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private LeaveRepository leaveRepository;
	
	@PostMapping("/leave/insert")
	public String insertLeave(@RequestBody LeaveDto leaveDto) {
		String str = "Leave Inserted";
		Leave leave = new Leave();
		leave.setStartDate(leaveDto.getStartDate());
		leave.setEndDate(leaveDto.getEndDate());
		leave.setDays(leaveDto.getDays());
		leave.setLeaveType(leaveDto.getLeaveType());
		leave.setStatus(leaveDto.getStatus());
		
		Employee employee = new Employee();
		employee.setId(leaveDto.getId());
		
		Employee employeeDb = employeeRepository.findById(employee.getId());
		if(employeeDb == null) {
			str = "employee id not present";
		}else {
			employee = employeeDb;
		}
		leave.setEmployee(employee);
		leaveRepository.save(leave);
		return str;
		
	}
}
