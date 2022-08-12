package com.CollegeService.ServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.CollegeService.Entity.College;
import com.CollegeService.Repository.CollegeRepository;
import com.CollegeService.ServiceInterface.CollegeServiceInterface;
import com.CollegeService.VO.RestTemplateVO;
import com.CollegeService.VO.Student;
@Service
public class CollegeServiceImpl implements CollegeServiceInterface{
	@Autowired
	private CollegeRepository collegerepo;
	
	@Autowired
	private RestTemplate resttemplate;

	@Override
	public List<RestTemplateVO> getAllCollege() {
		List<RestTemplateVO> a=new ArrayList<>();
		List<College> q=collegerepo.findAll();
		for(College d:q) {
			ResponseEntity<Student[]> emp=resttemplate.getForEntity("http://Student-Service/Student/"+d.getCName(), Student[].class);
			Student[] s=emp.getBody();
			List<Student> r=Arrays.asList(s);
			List<Student> f= r.stream().sorted((o1,o2)->o1.getSname().compareToIgnoreCase(o2.getSname())).collect(Collectors.toList());
			RestTemplateVO v=new RestTemplateVO();
			v.setCollege(d);
			v.setStudent(f);
			a.add(v);	
		}
		return a;
	}

	@Override
	public College AddCollege(College col) {
		return collegerepo.save(col);
	}

}
