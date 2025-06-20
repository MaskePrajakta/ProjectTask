package com.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Student;
import com.main.repo.StudentRepository;
import com.main.serviceinter.StudentServiceInter;

@Service
public class StudentServiceImpl implements StudentServiceInter {

	@Autowired
	StudentRepository sr;

	
	@Override
	public void addStudent(Student s) {
		sr.save(s);
		
	}


	@Override
	public Student getStudent(int rollno) {
		// TODO Auto-generated method stub
		return sr.findById(rollno).get();
	}

	
	
}
