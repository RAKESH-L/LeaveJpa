package com.sample.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "manager")
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "managername")
	private String mgrName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "dateofjoining")
	private String doj;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String mgrName, String email, String contact, String doj) {
		super();
		this.mgrName = mgrName;
		this.email = email;
		this.contact = contact;
		this.doj = doj;
	}

	public Manager(int id, String mgrName, String email, String contact, String doj) {
		super();
		this.id = id;
		this.mgrName = mgrName;
		this.email = email;
		this.contact = contact;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMgrName() {
		return mgrName;
	}

	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", mgrName=" + mgrName + ", email=" + email + ", contact=" + contact + ", doj="
				+ doj + "]";
	}

	
}
