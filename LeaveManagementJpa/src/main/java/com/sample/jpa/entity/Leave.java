package com.sample.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "leave1")
public class Leave {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "leaveid")
	private int leaveId;
	
	@Column(name = "startdate")
	private String startDate;
	
	@Column(name = "enddate")
	private String endDate;
	
	@Column(name = "days")
	private int days;
	
	@Column(name = "leavetype")
	private String leaveType;
	
	@Column(name = "status")
	private String status;
	
	@ManyToOne
	private Employee employee;

	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leave(String startDate, String endDate, int days, String leaveType, String status, Employee employee) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.days = days;
		this.leaveType = leaveType;
		this.status = status;
		this.employee = employee;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", startDate=" + startDate + ", endDate=" + endDate + ", days=" + days
				+ ", leaveType=" + leaveType + ", status=" + status + ", employee=" + employee + "]";
	}

	
	
}
