package com.StudentService.VO;

import com.StudentService.entity.Student;

public class RestTemplateVO {
	private College college;
	private Student stu;
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public RestTemplateVO(College college, Student stu) {
		super();
		this.college = college;
		this.stu = stu;
	}
	public RestTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
