package com.mysite.exam.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.exam.people.People;
import com.mysite.exam.people.PeopleService;

@RequestMapping("/book")
@RequiredArgsConstructor
@Controller
public class BookController {

	private final BookService bookService;
	private final PeopleService peopleService;
	
	@PostMapping("/add/{beid}")
	public String addBook(Model model,@PathVariable("beid") String beid, @RequestParam(value="bookname") String bookname) {
        People people = this.peopleService.getPeople(beid);
        this.bookService.add(people, bookname);
        return String.format("redirect:/people/detail/%s", beid);
    }
}
