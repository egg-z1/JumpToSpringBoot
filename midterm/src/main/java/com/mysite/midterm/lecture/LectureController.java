package com.mysite.midterm.lecture;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/lecture")
public class LectureController {

	private final LectureService lectureService;
	
	@GetMapping("/list")
	public String list(Model model){
		List<Lecture> lectureList = this.lectureService.getList();
		model.addAttribute("lectureList", lectureList);
		return "lecture_list";
	}
	
	@GetMapping(value = "/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Lecture lecture = this.lectureService.getLecture(id);
		model.addAttribute("lecture", lecture);
		return "lecture_detail";
	}
}
