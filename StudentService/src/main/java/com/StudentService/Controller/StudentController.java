package com.StudentService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentService.StudentServiceInterface.StudentInterface;
import com.StudentService.entity.Student;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private StudentInterface temp;
	@GetMapping
	public List<Student> getStudents(){
		return this.temp.getAllStudents();
	}
	@PostMapping("/")
	public Student addStudent(@RequestBody Student stu) {
		return this.temp.AddStudent(stu);
	}
	@GetMapping("/{Cname}")
	public List<Student> getStudentByCname(@PathVariable String Cname){
		return this.temp.getStudent(Cname);
	}
	@GetMapping("/Stream/{Sstream}")
	public List<Student> getStudentBystream(@PathVariable String Sstream){
		return this.temp.getStudentByStream(Sstream);
	}
	
}
