package com.mysite.exam.people;

import java.util.List;

import com.mysite.exam.book.Book;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class People {

	@Id
	@Column(length = 6)
	private String beid;
	
	@Column(length=10)
	private String name;

	@Column(length = 50)
	private String add;

	@Column(columnDefinition = "TEXT")
	private String memo;

	@OneToMany(mappedBy="people", cascade=CascadeType.REMOVE)
	private List<Book> bookList;
}
