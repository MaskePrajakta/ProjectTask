package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	
		
	
	
}
