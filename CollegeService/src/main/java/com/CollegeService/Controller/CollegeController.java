package com.CollegeService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CollegeService.Entity.College;
import com.CollegeService.ServiceInterface.CollegeServiceInterface;
import com.CollegeService.VO.RestTemplateVO;

@RestController
@RequestMapping("/College")
public class CollegeController {
	@Autowired
	private CollegeServiceInterface temp;
	
	@GetMapping
	public List<RestTemplateVO> getColleges(){
		return this.temp.getAllCollege();
	}
	@PostMapping("/")
	public College AddCollege(@RequestBody College col) {
		return this.temp.AddCollege(col);
	}
	
	
	
}
