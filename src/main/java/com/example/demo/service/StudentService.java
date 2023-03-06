package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
@Service
public interface StudentService {
	
	
	public List<Student> findAllStudent();
	public Student findById(int id);
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(int id);
	
}
