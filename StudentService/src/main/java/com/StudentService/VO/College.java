package com.StudentService.VO;



public class College {
	
	private String CName;
	
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
