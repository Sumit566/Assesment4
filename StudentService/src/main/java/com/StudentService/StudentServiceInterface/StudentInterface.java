package com.StudentService.StudentServiceInterface;

import java.util.List;

import com.StudentService.entity.Student;

public interface StudentInterface {
	
	public List<Student> getAllStudents();
	public Student AddStudent(Student stu);
	public List<Student> getStudent(String Cname);
	public List<Student> getStudentByStream(String Sstream);
}
