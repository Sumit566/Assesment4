package com.CollegeService.VO;



public class Student {
	
	
	private String Sname;
	
	private int age;
	
	private String gender;
	private String Sstream;
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
	public String getCname() {
		return CName;
	}
	public void setCname(String cname) {
		CName = cname;
	}
	public Student(String sname, int age, String gender, String sstream, String cname) {
		super();
		Sname = sname;
		this.age = age;
		this.gender = gender;
		Sstream = sstream;
		CName = cname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
