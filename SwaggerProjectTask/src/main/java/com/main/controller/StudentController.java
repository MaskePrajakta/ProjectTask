package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.serviceinter.StudentServiceInter;

@RestController
@CrossOrigin("*")
public class StudentController {

	@Autowired
	StudentServiceInter ssi;
	
	
	@PostMapping("/student")
	public void addStudentData(@RequestBody Student s) {
		ssi.addStudent(s);
		
	}
	
	@GetMapping("/student/{rollno}")
	public Student addStudentData(@PathVariable int rollno) {
		return ssi.getStudent(rollno);
		
	}

	@DeleteMapping("/student/{rollno}")
	public void deleteStudentData(@PathVariable int rollno) {
		 ssi.deleteStudent(rollno);
		
	}

		
	
	
}
