package com.StudentService.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.StudentService.Respository.StudentRepository;
import com.StudentService.StudentServiceInterface.StudentInterface;
import com.StudentService.VO.College;
import com.StudentService.entity.Student;
import com.ctc.wstx.shaded.msv_core.datatype.xsd.Comparator;
@Service
public class StudentServiceImpl implements StudentInterface{
	@Autowired
	private StudentRepository studentrepo;
	
	@Autowired
	private RestTemplate resttemplate;

	@Override
	public List<Student> getAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public Student AddStudent(Student stu) {
		return studentrepo.save(stu);
		
	}

	@Override
	public List<Student> getStudent(String Cname) {
		List<Student> st=new ArrayList<>();
		st=studentrepo.findAll();
		List<Student> s=new ArrayList<>();
		for(Student i:st) {
			if(i.getCName().equalsIgnoreCase(Cname)) {
				s.add(i);
			}
		}
		return s;
	}

	@Override
	public List<Student> getStudentByStream(String Sstream) {
		List<Student> st=new ArrayList<>();
		st=studentrepo.findAll();
		List<Student> s=new ArrayList<>();
		for(Student i:st) {
			if(i.getSstream().equalsIgnoreCase(Sstream)) {
				s.add(i);
			}
		}
		return s;
		
	}

}
