package com.CollegeService.ServiceInterface;

import java.util.List;

import com.CollegeService.Entity.College;
import com.CollegeService.VO.RestTemplateVO;

public interface CollegeServiceInterface {
	public List<RestTemplateVO> getAllCollege();
	public College AddCollege(College col);
}
