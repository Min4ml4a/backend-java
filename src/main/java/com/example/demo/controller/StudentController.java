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
				return "Delete success";
			}
		}
		return "student not found";
	}
}




/*

@Autowired
EmployeeRepository employeeRepository;

@Autowired
RoleRepository roleRepository;

@Autowired
SkillRepository skillRepository;

@GetMapping("/employee")
public ResponseEntity<Object> getEmployee() {
 try {		
     List<Employee> employees = employeeRepository.findAll(); 	
	 return new ResponseEntity<>(employees, HttpStatus.OK);
} catch (Exception e) {	
	return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
}

}

@PostMapping("/employee")
public ResponseEntity<Object> addEmployee(@RequestBody Employee body) {
	
	try {
		
		Optional<Role> role =roleRepository.findById(4);
		
		body.setRole(role.get());
		
		Employee employee =  employeeRepository.save(body);
		
        for(Skill skill: body.getSkills()) {
        	skill.setEmployee(employee);
        	
        	skillRepository.save(skill);
        	
		}
		
		return new ResponseEntity<>(employee, HttpStatus.CREATED);
		
	} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
}

@GetMapping("/employee/{employeeId}")
public ResponseEntity<Object> getEmployeeDetail(@PathVariable Integer employeeId) {

	try {		
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		if(employee.isPresent()) {
			return new ResponseEntity<>(employee, HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Employee not found", HttpStatus.BAD_REQUEST);
		}
				
	} catch (Exception e) {
		return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}

@PutMapping("employee/{employeeId}")
public ResponseEntity<Object> updateEmployee(@PathVariable Integer employeeId, @RequestBody Employee body) {

	try {
		Optional<Employee> employee = employeeRepository.findById(employeeId);

		if (employee.isPresent()) {
			Employee employeeEdit = employee.get();
			employeeEdit.setFirstName(body.getFirstName());
			employeeEdit.setLastName(body.getLastName());
			employeeEdit.setSalary(body.getSalary());
			employeeEdit.setEmployeeId(body.getEmployeeId());

			employeeRepository.save(employeeEdit);

			return new ResponseEntity<>(employeeEdit, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Employee not found", HttpStatus.BAD_REQUEST);
		}
		
	} catch (Exception e) {
		return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}

@DeleteMapping("employee/{employeeId}")
public ResponseEntity<Object> deleteEmployee(@PathVariable Integer employeeId) {
    
	try {
		Optional<Employee> employee = employeeRepository.findById(employeeId);

		if (employee.isPresent()) {
			employeeRepository.delete(employee.get());

			return  new ResponseEntity<>("DELETE SUCSESS", HttpStatus.OK );
		} else {
			return new ResponseEntity<>("Employee not found", HttpStatus.BAD_REQUEST);
		}			
	} catch (Exception e) {
		return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}

}
*/