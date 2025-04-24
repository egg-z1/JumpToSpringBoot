package com.mysite.midterm.student;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.midterm.lecture.Lecture;
import com.mysite.midterm.lecture.LectureService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
	
	private final LectureService lectureService;
	private final StudentService studentService;
	
	@GetMapping("/create/{id}")
	public String createStudent(
	    @PathVariable("id") Integer id,
	    @RequestParam("sid") Integer sid,
	    @RequestParam("sname") String sname,
	    @RequestParam("grade") Integer grade,
	    @RequestParam("major") String major
	) {
	    Lecture lecture = this.lectureService.getLecture(id);
	    this.studentService.create(lecture, sid, sname, grade, major);
	    return String.format("redirect:/lecture/detail/%s", id);
	}


	
	@GetMapping("/add/{id}")
	public String addStudentToLecture(
	    @PathVariable("id") Integer id,
	    @RequestParam("sid") Integer sid
	) {
	    Lecture lecture = this.lectureService.getLecture(id);
	    this.studentService.addExistingStudentToLecture(lecture, sid);
	    return String.format("redirect:/lecture/detail/%s", id);
	}

}
