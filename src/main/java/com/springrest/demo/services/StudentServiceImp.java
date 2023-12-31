package com.springrest.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.demo.dao.StudentDao;
import com.springrest.demo.entities.Student;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentDao coachingDao;

	@Override
	public List<Student> getStudent() {
		
		return coachingDao.findAll();
	}

	@Override
	public Student addStudent(Student coaching) {

		coachingDao.save(coaching);
		return coaching;
		
	}

	@Override
	public Student updateStudent(Student coaching) {
		
		coachingDao.save(coaching);
		return coaching;
	}

	@Override
	public void deleteStudent(long parseLong) {
		
		Student entity=coachingDao.getById(parseLong);
		coachingDao.delete(entity);
	}
}
