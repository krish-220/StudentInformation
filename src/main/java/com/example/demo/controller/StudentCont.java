package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping("/api/v1")
public class StudentCont {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/get students")
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentService.findAllStudent();
	}
	
	@GetMapping("/getstudentsbyid/{id}")
	public Student findById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return studentService.findById(id);
		
	}
	
	@PostMapping("/addstudents")
	public Student saveStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/updatestudents")
	public Student updateStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		return studentService.saveStudent(student);
	}
	
	@DeleteMapping("/deletestudentbyid/{id}")
	public void deleteStudent(@PathVariable int id) {
		// TODO Auto-generated method stub
		 studentService.deleteStudent(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
