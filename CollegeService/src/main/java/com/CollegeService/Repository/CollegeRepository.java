package com.CollegeService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CollegeService.Entity.College;

public interface CollegeRepository extends JpaRepository<College,String>{

}
