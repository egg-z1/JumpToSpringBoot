package com.mysite.exam.people;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/people")
public class PeopleController {

	private final PeopleService peopleService;
	
	@GetMapping("/list")
	public String list(Model model){
		List<People> peopleList = this.peopleService.getList();
		model.addAttribute("peopleList", peopleList);
		return "people_list";
	}
	
	@GetMapping(value = "/detail/{id}")
	public String detail(Model model, @PathVariable("id") String beid) {
		People people = this.peopleService.getPeople(beid);
		model.addAttribute("people", people);
		return "people_detail";
	}
}
