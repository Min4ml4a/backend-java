package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Student;
@RestController
public class StudentController {
private List<Student> data = new ArrayList<Student>();
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		return data;
    }

	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student body) {
		
		for(int i = 0; i < data.size(); i++) {
			if(body.getStudentId() == data.get(i).getStudentId()) {
			return null;
			
			}
		}
		data.add(body);
		return body;
		
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudentDetail(@PathVariable Integer studentId) {
		
		for(int i = 0; i < data.size(); i++) {
			if(studentId == data.get(i).getStudentId()) {
				return data.get(i);
			}
		}
		
		return null;
		
	}
	
	@PutMapping("/student/{studentId}")
	public Student updateStudent(@PathVariable Integer studentId, @RequestBody Student body) {
		
		for(int i = 0; i < data.size(); i++) {
			if(studentId == data.get(i).getStudentId()) {
				
				data.get(i).setStudentId(body.getStudentId());
				data.get(i).setStudentName(body.getStudentName());
				data.get(i).setStudentLastname(body.getStudentLastname());
				data.get(i).setEmail(body.getEmail());
		
				return data.get(i);
			}
		}
		return null;
	}
	
	@DeleteMapping("/student/{studentId}")
	public String deleteStudent(@PathVariable Integer studentId) {
		
		for(int i = 0; i < data.size(); i++) {
			if(studentId == data.get(i).getStudentId()) {
				data.remove(i);
				return "delete success";
			}
		}
		return "employee not found";
	}
}
