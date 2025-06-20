package com.main.serviceinter;

import com.main.model.Student;

public interface StudentServiceInter {

	void addStudent(Student s);

	Student getStudent(int rollno);

	void deleteStudent(int rollno);


	

}
