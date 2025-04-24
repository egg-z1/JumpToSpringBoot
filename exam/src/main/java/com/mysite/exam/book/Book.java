package com.mysite.exam.book;
import java.time.LocalDateTime;

import com.mysite.exam.people.People;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length=20)
	private String bookname;

	private LocalDateTime dyDate;

	@ManyToOne
	private People people;
}
