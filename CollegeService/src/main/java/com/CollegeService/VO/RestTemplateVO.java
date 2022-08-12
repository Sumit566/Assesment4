package com.CollegeService.VO;

import java.util.List;

import com.CollegeService.Entity.College;

public class RestTemplateVO {
	private College college;
	
	private List<Student> student;

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public RestTemplateVO(College college, List<Student> student) {
		super();
		this.college = college;
		this.student = student;
	}

	public RestTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
