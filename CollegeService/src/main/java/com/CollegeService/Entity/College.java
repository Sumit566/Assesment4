package com.CollegeService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="College")
public class College {
	@Id
	@Column(name="College_Name")
	private String CName;
	@Column(name="No.OFStudents")
	private int totalNumberStudents;
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public int getTotalNumberStudents() {
		return totalNumberStudents;
	}
	public void setTotalNumberStudents(int totalNumberStudents) {
		this.totalNumberStudents = totalNumberStudents;
	}
	public College(String cName, int totalNumberStudents) {
		super();
		CName = cName;
		this.totalNumberStudents = totalNumberStudents;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
