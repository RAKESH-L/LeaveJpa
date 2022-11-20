package com.sample.jpa.dto;

public class LeaveDto {

	private String startDate;
	private String endDate;
	private int days;
	private String leaveType;
	private String status;
	private int id;
	public LeaveDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveDto(String startDate, String endDate, int days, String leaveType, String status, int id) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.days = days;
		this.leaveType = leaveType;
		this.status = status;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "LeaveDto [startDate=" + startDate + ", endDate=" + endDate + ", days=" + days + ", leaveType="
				+ leaveType + ", status=" + status + ", id=" + id + "]";
	}
	
	
}
