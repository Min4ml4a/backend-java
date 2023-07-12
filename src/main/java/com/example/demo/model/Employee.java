package com.example.demo.model;

public class Employee {
	
	private String employeeId ;
	private String fristName ;
	private String lastName ;
	private String salaly ;
	
	
	
	public Employee() {
		super();
	}


	public Employee(String employeeId, String fristName, String lastName, String salaly) {
		super();
		this.employeeId = employeeId;
		this.fristName = fristName;
		this.lastName = lastName;
		this.salaly = salaly;
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSalaly() {
		return salaly;
	}
	public void setSalaly(String salaly) {
		this.salaly = salaly;
	}

}
