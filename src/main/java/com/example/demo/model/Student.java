package com.example.demo.model;

public class Student {

	
	private Integer studentId ;
	private String studentName;
	private String studentLastname;
	private String email;
	
	
	public Student() {
		super();
	}
	public Student(Integer studentId, String studentName, String studentLastname, String email) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentLastname = studentLastname;
		this.email = email;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentLastname() {
		return studentLastname;
	}
	public void setStudentLastname(String studentLastname) {
		this.studentLastname = studentLastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
