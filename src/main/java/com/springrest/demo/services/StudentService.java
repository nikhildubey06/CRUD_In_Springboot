package com.springrest.demo.services;

import java.util.*;

import com.springrest.demo.entities.Student;

public interface StudentService {
	
	public List<Student> getStudent();
	
	public Student addStudent(Student student);

	public Student updateStudent(Student student);

	public void deleteStudent(long parseLong);
} 