package com.springrest.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.demo.entities.Student;

public interface StudentDao extends JpaRepository<Student,Long>{

}
