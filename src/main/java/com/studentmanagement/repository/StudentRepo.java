package com.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.entity.StudentInfo;

public interface StudentRepo extends JpaRepository<StudentInfo, Long>{
	
	
}
