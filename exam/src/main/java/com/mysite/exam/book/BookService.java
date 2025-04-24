package com.mysite.exam.book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.mysite.exam.people.People;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class BookService {
	
	private final BookRepository bookRepostiory;
	
	public void add(People people, String bookname) {
		Book book = new Book();
		book.setBookname(bookname);
		book.setDyDate(LocalDateTime.now());
		book.setPeople(people);
		this.bookRepostiory.save(book);
	}

}
