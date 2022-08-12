package com.StudentService.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentService.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,String>{

}
