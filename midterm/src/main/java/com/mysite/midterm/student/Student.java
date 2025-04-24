package com.mysite.midterm.student;

import java.time.LocalDateTime;

import com.mysite.midterm.lecture.Lecture;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

	@Id
	private Integer sid;
	
	@Column(length=10)
	private String sname;
	
	@Column
	private Integer grade;
	
	@Column(length=20)
	private String major;
	
	private LocalDateTime createDate;
	
	@ManyToOne
	private Lecture lecture;
}
