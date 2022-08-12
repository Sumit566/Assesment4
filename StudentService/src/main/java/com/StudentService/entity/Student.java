package com.StudentService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@Column(name="Student_Name")
	private String Sname;
	@Column(name="Student_age")
	private int age;
	@Column(name="Student_gender")
	private String gender;
	@Column(name="Student_Stream")
	private String Sstream;
	@Column(name="College_Name")
	private String CName;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSstream() {
		return Sstream;
	}
	public void setSstream(String sstream) {
		Sstream = sstream;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public Student(String sname, int age, String gender, String sstream, String cName) {
		super();
		Sname = sname;
		this.age = age;
		this.gender = gender;
		Sstream = sstream;
		CName = cName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
