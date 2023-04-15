package com.studentmanagement.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.entity.StudentInfo;
import com.studentmanagement.repository.StudentRepo;
import com.studentmanagement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo stdRepo;
	
	@Override
	public List<StudentInfo> getAllStudents() {
		
		return stdRepo.findAll();
	}

	@Override
	public StudentInfo saveStudent(StudentInfo student) {
		
		return stdRepo.save(student);
	}
	

}
