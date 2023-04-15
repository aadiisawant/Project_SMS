package com.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentmanagement.entity.StudentInfo;
import com.studentmanagement.service.StudentService;

@Controller
public class studentController {

	@Autowired
	private StudentService stdService;
	@GetMapping("/students")
	public String allStudents(Model model) {
		model.addAttribute("students",stdService.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		StudentInfo std = new StudentInfo();
		model.addAttribute("student",std);
		return "new_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")StudentInfo student) {
		stdService.saveStudent(student);
		return "redirect:/students";
	}
}
