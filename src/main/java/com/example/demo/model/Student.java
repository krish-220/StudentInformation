package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student information")
public class Student {
	@Id
	private int id;
	private String name;
	private int rollno;
	private int phoneno;
	private String district;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", phoneno=" + phoneno + ", district=" + district + "]";
	}
	public Student(String name, int rollno, int phoneno, String district) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.phoneno = phoneno;
		this.district = district;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
