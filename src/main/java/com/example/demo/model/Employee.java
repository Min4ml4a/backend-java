package com.example.demo.model;

public class Employee {
	
	private String employeeId ;
	private String firstName ;
	private String lastName ;
	private String salary ;
	
	public Employee() {
		super();
	}
	

	public Employee(String employeeId, String firstName, String lastName, String salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
	/*public Employee() {
		super();
	}
	

	public Employee(String employeeId, String firstName, String lastName, String salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFristName() {
		return firstName;
	}
	public void setFristName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalaly(String salary) {
		this.salary = salary;
	}

}
*/