package com.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentmanagement.entity.StudentInfo;
import com.studentmanagement.repository.StudentRepo;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepo studentdRepo;
	@Override
	public void run(String... args) throws Exception {
//			StudentInfo std1 = new StudentInfo("Ramesh","Shaloke","ramesh@gmail.com");
//			studentdRepo.save(std1);
//			StudentInfo std2 = new StudentInfo("Aditya","Sawant","aditya@gmail.com");
//			studentdRepo.save(std2);
//			StudentInfo std3 = new StudentInfo("Abhijit","Kadam","abhijit@gmail.com");
//			studentdRepo.save(std3);
			
	}

}
