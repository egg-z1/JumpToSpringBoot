package com.mysite.test.user;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
	
	private final StudentService studentService;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Student> studentList = this.studentService.getList();
		model.addAttribute("studentList", studentList);
		return "student_list";
	}
	
	@GetMapping("/detail/{sId}")
	public String detail(Model model, @PathVariable("sId") Integer sId) {
		Student student = this.studentService.getStudent(sId);
		model.addAttribute("student", student);
		return "student_detail";
	}
	
	@PostMapping("/modify/{sId}")
	public String modifyStudent(Model model, @PathVariable("sId") Integer sId, @RequestParam(value="memo") String memo) {
		Student student = this.studentService.getStudent(sId);
		this.studentService.modify(student, memo);
		return String.format("redirect:/student/detail/%s", sId);
	}

}
