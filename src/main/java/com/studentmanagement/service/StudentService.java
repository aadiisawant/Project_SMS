package com.studentmanagement.service;

import java.util.List;

import com.studentmanagement.entity.StudentInfo;

public interface StudentService {
	List<StudentInfo> getAllStudents();

	StudentInfo saveStudent(StudentInfo student);
	
}
